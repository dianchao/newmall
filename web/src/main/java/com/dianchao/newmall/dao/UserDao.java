package com.dianchao.newmall.dao;

import com.dianchao.newmall.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from tl_user")
    List<User> queryAll();
}
