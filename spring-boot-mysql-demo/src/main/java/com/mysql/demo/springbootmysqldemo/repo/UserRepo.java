package com.mysql.demo.springbootmysqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.demo.springbootmysqldemo.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
