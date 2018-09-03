package com.ipaynow.demo.dto;

import java.io.Serializable;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/9/3
 * Time 下午11:14
 */
public class HelleRequest implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
