package com.jwt.service;

import com.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Mohd Nazim","nazim@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Junaid Khan","junaid@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"John Cena","john@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Undertaker","taker@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
