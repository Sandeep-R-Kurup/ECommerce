package com.sandeep.Ecommerce.DOA;

import com.sandeep.Ecommerce.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {
}
