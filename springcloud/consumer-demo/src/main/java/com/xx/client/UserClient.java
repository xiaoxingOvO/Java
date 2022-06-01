package com.xx.client;

import com.xx.client.fallback.UserClientFallback;
import com.xx.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.xx.pojo.User;

//声明当前类是一个Feign客户端，指定服务名为user-service
@FeignClient(value = "user-service", fallback = UserClientFallback.class,
configuration = FeignConfig.class)
public interface UserClient {

    //http://user-service/user/123
    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);
}
