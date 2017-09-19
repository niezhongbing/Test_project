package com.cz.server;

import javax.xml.ws.Endpoint;

public class WeatServer {

	public static void main(String[] args) {
		//endpoint发布服务
		//1.address 服务地址 ,2 implementor 实现类
		Endpoint.publish("http://127.0.0.1:12345/Weather", new WeatherInterfaceImpl());
	}
}
