package com.xx.repository;

import com.xx.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author xiaoxing
 * @create 2022-03-10 14:26
 */
public interface UserRepository extends MongoRepository<User, String> {}
