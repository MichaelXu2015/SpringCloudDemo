package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关的作用:
 * 所有外部的访问都需要通过Zuul网关才能访问,可以过滤掉一些非法请求
 * 通过yml配置将外部的访问路径和微服务的路径映射,让外界不能访问真实的微服务名称
 * 
 * @author xuchao
 *
 */
@SpringBootApplication
@EnableZuulProxy //开启zuul网关
public class Zuul_9527_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
}
