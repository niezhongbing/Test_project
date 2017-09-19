package com.cz.client;

import com.cz.server.WeatherInterfaceImpl;
import com.cz.server.WeatherInterfaceImplService;

public class WeatherClient {

	public static void main(String[] args) {
		//创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService=new WeatherInterfaceImplService();
		//获取服务实现类
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//调用查询方法
		System.out.println(weatherInterfaceImpl.queryWeather("北京"));
	}
	
}
