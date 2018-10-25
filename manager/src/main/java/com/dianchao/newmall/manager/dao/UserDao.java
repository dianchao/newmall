package com.dianchao.newmall.manager.dao;

import com.dianchao.newmall.common.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    User queryLoginUser(User user);
}
