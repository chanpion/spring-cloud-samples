package com.chanpion.cloud.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author April Chen
 * @date 2020/2/14 14:28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigApplicaion {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplicaion.class, args);
    }
}
