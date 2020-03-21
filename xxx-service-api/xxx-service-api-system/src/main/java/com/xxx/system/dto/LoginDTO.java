package com.xxx.system.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 张咪
 * @history 2020/3/21 新建
 * @since JDK1.7
 */
@Getter
@Setter
public class LoginDTO implements Serializable {

    private String userName;

    private String password;
}
