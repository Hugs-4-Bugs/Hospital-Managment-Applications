package com.springRest.DAO;

import com.springRest.enitity.User;
import com.springRest.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
