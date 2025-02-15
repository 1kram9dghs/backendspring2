package com.akram.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akram.users.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);


}
