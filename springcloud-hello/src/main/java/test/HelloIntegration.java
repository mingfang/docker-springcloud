package test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class HelloIntegration {

    @HystrixCommand
    public String getHello() throws UnknownHostException {
        return "Hello, my ip is " + InetAddress.getLocalHost().getHostAddress();
    }
}
