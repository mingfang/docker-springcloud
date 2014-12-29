package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClientScan;

@SpringBootApplication
@EnableDiscoveryClient
@FeignClientScan
public class HelloClientApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloClientApp.class).web(true).run(args);
    }
}
