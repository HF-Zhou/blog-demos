package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.bean.User;

//由Spring自动实现，包含CRUD(Create, Read, Update, Delete)
public interface UserRepository extends CrudRepository<User, Long>{

}
