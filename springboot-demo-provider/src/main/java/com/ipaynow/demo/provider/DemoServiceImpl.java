package com.ipaynow.demo.provider;

import com.ipaynow.demo.api.DemoService;
import com.ipaynow.demo.dto.BusinessException;
import com.ipaynow.demo.dto.HelleRequest;
import com.ipaynow.demo.dto.HelloResponse;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/9/3
 * Time 下午7:43
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public HelloResponse hello(HelleRequest request) throws BusinessException {
        String name = request.getName();
        String result = "Hello," + name;
        HelloResponse response = new HelloResponse();
        response.setResult(result);
        return response;
    }

    @Override
    public void helloException() throws BusinessException {
        throw new BusinessException(-1,"故意抛异常");
    }
}
