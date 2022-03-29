package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Nik", "Smit", (byte) 1);
        userService.saveUser("Niki", "Smiti", (byte) 2);
        userService.saveUser("Nikiti", "Smititi", (byte) 3);
        userService.saveUser("Nikin", "Petrov", (byte) 4);

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
