package com.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.student;

public interface StudentRepository extends JpaRepository<student, Integer> {

}
