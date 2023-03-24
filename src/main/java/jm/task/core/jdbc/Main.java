package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Михаил", "Круг", (byte) 33);
        userService.saveUser("Алина", "Пай", (byte) 27);
        userService.saveUser("Михаил", "Звездинский", (byte) 78);
        userService.saveUser("Алексей", "Попович", (byte) 20);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}