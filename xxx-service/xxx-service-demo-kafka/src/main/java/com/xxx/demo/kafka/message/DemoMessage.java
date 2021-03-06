package com.xxx.demo.kafka.message;

import java.io.Serializable;

/**
 * 示例 Message 消息
 */
public class DemoMessage implements Serializable {

    public static final String TOPIC = "DEMO";

    /**
     * 编号
     */
    private Integer id;

    public DemoMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DemoMessage{" +
                "id=" + id +
                '}';
    }

}
