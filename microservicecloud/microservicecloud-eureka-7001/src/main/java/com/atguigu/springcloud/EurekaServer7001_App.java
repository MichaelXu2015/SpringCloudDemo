package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka:服务注册中心,所有的服务提供者向eureka注册,消费者通过eureka去找服务提供者.
 * @author xuchao
 *
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
