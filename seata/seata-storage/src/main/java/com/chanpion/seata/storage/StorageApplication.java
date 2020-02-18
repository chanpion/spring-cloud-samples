package com.chanpion.seata.storage;

/**
 * @author April Chen
 * @date 2020/2/17 16:17
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);

    }
}
