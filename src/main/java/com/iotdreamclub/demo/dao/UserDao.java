package com.iotdreamclub.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iotdreamclub.demo.entity.User;
import com.iotdreamclub.demo.entity.UserLoginInfo;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserDao extends BaseMapper<User> {
    User login (String username , String password);
    void register (String username , String password ,String userPhone);
    void changePersonalInfomation(String username, String password ,String userIdNumber , String userPhone , String userClassName , String userLimit);
    List<User> selectAll();
    User selectUserByName(String username);
    User selectUserByPhone(String userPhone);
    User selectLimitByName(String userlimit);

    void insertLoginInfo(String username , String loginIpAddress ,String loginAddress);
    List<UserLoginInfo> selectAllLoginInfo();
    void changeUserPassword(String password , String userIdNumber);
}
