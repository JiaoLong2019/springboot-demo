package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.UserDao;
import com.jk.model.cjl.YongHu;
import com.jk.service.cjl.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<YongHu> queryUser() {
        return userDao.queryUser();
    }
}
