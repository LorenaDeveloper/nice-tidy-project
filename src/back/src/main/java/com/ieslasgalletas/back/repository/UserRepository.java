package com.ieslasgalletas.back.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieslasgalletas.back.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {
}
