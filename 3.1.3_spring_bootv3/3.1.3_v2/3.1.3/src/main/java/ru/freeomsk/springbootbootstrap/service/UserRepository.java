package ru.freeomsk.springbootbootstrap.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.freeomsk.springbootbootstrap.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u from User u join fetch u.roles where u.login = :username")
    User findByUsername(@Param("username") String username);
}


