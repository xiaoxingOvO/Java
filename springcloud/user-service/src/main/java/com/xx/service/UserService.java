package com.xx.service;

import com.xx.mapper.UserMapper;
import com.xx.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @author xiaoxing
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2022-05-19 16:12:41
*/
public interface UserService extends IService<User> {

    User getUserById(Long id);

}
