package cn.eone.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：pengzhaofeng
 * @ Date       ：Created in 16:46 2018/12/8 0008
 * @ Description：
 * @ Modified By：
 * @Version:
 **/

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getInfo")
    public String getInfo() {
        String result = restTemplate.getForObject("http://ticket-provider/getInfo", String.class);
        return result;
    }
}

