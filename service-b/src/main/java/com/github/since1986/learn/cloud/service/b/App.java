package com.github.since1986.learn.cloud.service.b;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class App {

    private final EurekaClient eurekaClient;

    @Autowired
    public App(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Scheduled(initialDelay = 1000 * 60 * 3, fixedRate = 1000 * 30)
    public void printInstanceInfo() {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("com-github-since1986-learn-cloud-service-a", false);
        System.out.println(String.format("发现了 服务名为 %s IP为 %s 的服务.", instanceInfo.getAppName(), instanceInfo.getIPAddr()));
    }
}
