package com.customer.management.repo;

import com.customer.management.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<user, Long> {
}
