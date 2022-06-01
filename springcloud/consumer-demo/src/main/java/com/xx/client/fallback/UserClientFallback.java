package com.xx.client.fallback;


import com.xx.client.UserClient;
import org.springframework.stereotype.Component;
import com.xx.pojo.User;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户异常");
        return user;
    }
}
