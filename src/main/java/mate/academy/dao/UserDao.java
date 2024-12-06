package mate.academy.dao;

import mate.academy.model.User;

import java.util.Optional;

public interface UserDao {
    User add(User user);

    Optional<User> get(String email);
}

