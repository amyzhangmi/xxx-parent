package com.xxx.system.handler;

import com.xxx.framework.common.entity.Result;
import com.xxx.system.dto.LoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/system")
public interface UserHandler {

    @RequestMapping("/login")
    public Result login( LoginDTO dto);
}
