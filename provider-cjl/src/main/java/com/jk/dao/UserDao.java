package com.jk.dao;

import com.jk.model.cjl.User;
import com.jk.model.cjl.YongHu;

import java.util.List;


public interface UserDao {
    List<YongHu> queryUser();
}
