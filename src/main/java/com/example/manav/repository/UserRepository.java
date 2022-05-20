package com.example.manav.repository;

import com.example.manav.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value="SELECT email FROM prashant.user where email =?1 and password=?2",nativeQuery = true)
    String findByEmail(String email,String pass);
}
