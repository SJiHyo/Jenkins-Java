package com.storeapi.demo.AdminRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storeapi.demo.Admin.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
