package com.sglwb.dao;

import com.sglwb.bean.UserBean;

public interface UserDao {
    void register(UserBean user) throws Exception;

    UserBean userLogin(UserBean user)throws Exception;
}
