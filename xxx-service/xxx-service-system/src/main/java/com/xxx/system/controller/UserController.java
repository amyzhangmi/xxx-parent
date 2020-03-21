package com.xxx.system.controller;

import com.xxx.framework.common.base.BaseController;
import com.xxx.framework.common.entity.Result;
import com.xxx.system.dto.LoginDTO;
import com.xxx.system.handler.UserHandler;
import com.xxx.framework.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 张咪
 * @history 2020/3/21 新建
 * @since JDK1.7
 */
@RestController
@Slf4j
public class UserController extends BaseController implements UserHandler {

    @Override
    public Result login( LoginDTO dto) {
        if(null != dto && "admin".equals(dto.getUserName()) && "admin".equals(dto.getPassword())){
            String token = JwtUtil.createJWT(UUID.randomUUID().toString(), dto.getUserName(), null);
            log.info("token:{}",token);
            return Result.success(token);
        }else {
            return Result.fail(-1, "用户名或密码错误!");
        }
    }
}
