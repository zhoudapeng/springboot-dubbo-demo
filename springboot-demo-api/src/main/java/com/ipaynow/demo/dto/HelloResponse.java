package com.ipaynow.demo.dto;

import java.io.Serializable;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/9/3
 * Time 下午11:14
 */
public class HelloResponse implements Serializable {
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
