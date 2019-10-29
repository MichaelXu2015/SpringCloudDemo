package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * feign:面向接口编程访问服务
 * @author xuchao
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80_Feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
