package com.frois.backend_bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frois.backend_bank.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
