package com.spring.mvc.service;

import com.spring.mvc.dao.UserDaoImplements;
import com.spring.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDaoImplements userDao;

    public int createUser(User user) {
        return this.userDao.saveUser(user);
    }

}
