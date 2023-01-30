package com.dev.restfulwebservice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    // First starting with a static array list

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Fred",LocalDate.now().minusYears(35)));
        users.add(new User(1,"Kembo",LocalDate.now().minusYears(30)));
        users.add(new User(1,"Otis",LocalDate.now().minusYears(25)));
    }

    public List<User> findAll() {
        return users;
    }

}
