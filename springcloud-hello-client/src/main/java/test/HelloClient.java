package test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("zuul")
//@FeignClient(value = "http://192.168.59.103:8080", loadbalance = false)
public interface  HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/helloservice")
    String getHello();
}
