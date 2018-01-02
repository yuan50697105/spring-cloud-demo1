package com.example.demoserviceprovider.repository;

import com.example.demoserviceprovider.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getById(long id);

}
