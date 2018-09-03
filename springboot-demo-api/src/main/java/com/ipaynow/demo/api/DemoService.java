package com.ipaynow.demo.api;

import com.ipaynow.demo.dto.BusinessException;
import com.ipaynow.demo.dto.HelleRequest;
import com.ipaynow.demo.dto.HelloResponse;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/9/3
 * Time 下午7:40
 */
public interface DemoService {
    HelloResponse hello(HelleRequest request) throws BusinessException;

    void helloException() throws BusinessException;
}
