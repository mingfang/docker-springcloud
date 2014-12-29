package springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableHystrixDashboard
@EnableZuulProxy
public class ZuulProxy {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulProxy.class).web(true).run(args);
    }

}