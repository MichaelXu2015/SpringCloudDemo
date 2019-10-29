package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean 
{ 
	
	
	/**
	 * RestTemplate是什么?
	 * RestTemplate提供了多种便捷访问远程Http服务的方法,是Spring提供的用于访问Rest服务的客户端模板工具
	 * @return
	 */
	
	/**
	 * @LoadBalanced 作用:1.做客户端的负载均衡
	 * 					 2.客户端通过服务提供者的服务名称调用服务,而不需要通过ip了
	 * 
	 * @LoadBalanced 默认的负载均衡策略是轮询,每个服务调用一次
	 * @return
	 */
	@Bean
	@LoadBalanced// 开启 Ribbon负载均衡
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule()
	{
		//return new RoundRobinRule();
		//return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
		return new RetryRule();
	}
}

//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">