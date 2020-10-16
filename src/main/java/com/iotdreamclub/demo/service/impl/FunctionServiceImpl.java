package com.iotdreamclub.demo.service.impl;

import com.iotdreamclub.demo.service.FunctionService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;


public class FunctionServiceImpl implements FunctionService {
    @Override
    public String getCookieValue(String cookieName , HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            if (cookie.getName().equals(cookieName)){
                return cookie.getValue();
            }
        }
        return null;
    }
}