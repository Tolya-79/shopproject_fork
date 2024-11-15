package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telran.shop.de.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByLogin(String login);
}
