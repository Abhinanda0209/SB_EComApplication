package com.aurora.sb_ecom.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService{

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        // File names of current/original file
        String originalFileName = file.getOriginalFilename();

        // Generate a unique file name
        String randomId = UUID.randomUUID().toString();
        String filename = randomId.concat(originalFileName.substring(originalFileName.lastIndexOf('.')));
        String filepath = path + File.separator + filename;

        // Check if path exist else create
        File folder = new File(path);
        if(!folder.exists())
            folder.mkdir();

        // Upload to server
        Files.copy(file.getInputStream(), Paths.get(filepath));

        // return file name
        return filename;
    }
}
