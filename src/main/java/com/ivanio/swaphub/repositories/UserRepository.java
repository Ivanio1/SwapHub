package com.ivanio.swaphub.repositories;

import com.ivanio.swaphub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
