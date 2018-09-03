package com.ipaynow.springboot.demo.consumer;

import com.ipaynow.demo.api.DemoService;
import com.ipaynow.demo.dto.BusinessException;
import com.ipaynow.demo.dto.HelleRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/9/3
 * Time 下午10:55
 */
@RestController
@RequestMapping("/springboot")
public class SpringBootDemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        String msg = "";
        try {
            HelleRequest request = new HelleRequest();
            request.setName(name);
            return demoService.hello(request).toString();
        }catch (BusinessException e) {
            e.printStackTrace();
            msg = e.getMsg();
        }catch (Exception e) {
            e.printStackTrace();
            msg = "system error";
        }
        return msg;
    }

    @RequestMapping("/exception")
    public String testException() {
        String result = "";
        try {
            demoService.helloException();
        }catch (BusinessException be) {
            result = be.getMsg();
        }catch (Exception e) {
            result = "system error";
        }
        return result;
    }

}
