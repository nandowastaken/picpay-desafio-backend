package com.fernando.picpay_desafio_backend.repositories;

import com.fernando.picpay_desafio_backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
