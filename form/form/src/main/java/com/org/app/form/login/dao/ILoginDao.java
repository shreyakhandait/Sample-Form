package com.org.app.form.login.dao;

import com.org.app.form.login.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILoginDao extends JpaRepository<Login, Long> {
    Optional<Login> findByUsername(String username);

    void deleteByUsername(String username);
}

