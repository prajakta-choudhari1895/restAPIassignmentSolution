package com.gls.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.employeecrud.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
