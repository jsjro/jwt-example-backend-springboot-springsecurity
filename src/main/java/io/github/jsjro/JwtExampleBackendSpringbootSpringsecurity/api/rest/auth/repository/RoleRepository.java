package io.github.jsjro.JwtExampleBackendSpringbootSpringsecurity.api.rest.auth.repository;

import io.github.jsjro.JwtExampleBackendSpringbootSpringsecurity.api.rest.auth.models.ERole;
import io.github.jsjro.JwtExampleBackendSpringbootSpringsecurity.api.rest.auth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}