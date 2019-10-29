
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此工程是config的client端,该工程会通过config-3344从git上找加载相关的配置文件
 * @author xuchao
 *
 */
@SpringBootApplication
public class ConfigClient_3355_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
	}
}
