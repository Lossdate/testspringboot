package com.testspringboot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xsyzx on 2018/6/7.
 */
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
    List<User> findByNameLike(String name);
    User save(User user);
}
