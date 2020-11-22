package com.millwave.aop;

import com.millwave.common.service.RedisService;
import com.millwave.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RedisSessionInterceptor implements HandlerInterceptor {

    @Autowired
    public RedisService redisService;

    public boolean preHandle(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("token") != null) {
            String token = (String) session.getAttribute("token");
            if ("".equals(token)) {
                return false;
            }
            User user = (User) redisService.hGet("loginUser", token);
            if (user == null || user.getId() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
