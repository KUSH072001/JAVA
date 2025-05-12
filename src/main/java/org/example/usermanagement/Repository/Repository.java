package org.example.usermanagement.Repository;

import org.example.usermanagement.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
