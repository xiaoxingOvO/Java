package com.xx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.pojo.User;
import com.xx.service.UserService;
import com.xx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2022-05-19 16:12:41
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public User getUserById(Long id) {
        return baseMapper.selectById(id);
    }
}




