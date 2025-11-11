package com.aurora.sb_ecom.repositories;

import com.aurora.sb_ecom.model.AppRole;
import com.aurora.sb_ecom.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
