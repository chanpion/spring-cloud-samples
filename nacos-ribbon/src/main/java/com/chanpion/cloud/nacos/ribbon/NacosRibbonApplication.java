package com.chanpion.cloud.nacos.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author April Chen
 * @date 2020/2/14 14:14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRibbonApplication.class, args);
    }
}
