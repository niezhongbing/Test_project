package com.cz.server;

import javax.xml.ws.Endpoint;

public class WeatServer {

	public static void main(String[] args) {
		//endpoint��������
		//1.address �����ַ ,2 implementor ʵ����
		Endpoint.publish("http://127.0.0.1:12345/Weather", new WeatherInterfaceImpl());
	}
}
