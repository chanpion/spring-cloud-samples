package com.chanpion.cloud.nacos.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author April Chen
 * @date 2020/2/14 14:09
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserApplication.class, args);
    }
}
