package ru.freeomsk.springbootbootstrap.service;


import ru.freeomsk.springbootbootstrap.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String login);

    User getUserById(long id);



}
