package com.zn.jrb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: ServiceCoreApplication
 * Package: com.zn.jrb.core
 * Description:
 * Created on 2025/1/12-12:26
 *
 * @author zhaonian
 */
@SpringBootApplication
@ComponentScan({"com.zn.jrb","com.zn.common"})
public class ServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}
