package com.zjl17126.service.impl;

import com.zjl17126.dao.UserDao;
import com.zjl17126.entity.User;
import com.zjl17126.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User getUser(int id) {
      return userDao.getUser(id);
    }
}
