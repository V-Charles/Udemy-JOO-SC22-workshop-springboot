package com.courseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseudemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
