package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.DiscoveryHeartbeatEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ProxyRegistrator implements ApplicationListener<DiscoveryHeartbeatEvent> {

    @Override
    public void onApplicationEvent(DiscoveryHeartbeatEvent discoveryHeartbeatEvent) {
        System.out.println("discoveryHeartbeatEvent = " + discoveryHeartbeatEvent);
        handleRoutes();
    }

    @Autowired
    HelloClient helloClient;

    @Autowired
    DiscoveryClient discoveryClient;

    private void handleRoutes() {

        System.out.println("discoveryClient = " + discoveryClient.getInstances("zuul"));
        System.out.println("hello:" + helloClient.getHello());
    }
}