package com.cz.client;

import com.cz.server.WeatherInterfaceImpl;
import com.cz.server.WeatherInterfaceImplService;

public class WeatherClient {

	public static void main(String[] args) {
		//����������ͼ
		WeatherInterfaceImplService weatherInterfaceImplService=new WeatherInterfaceImplService();
		//��ȡ����ʵ����
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//���ò�ѯ����
		System.out.println(weatherInterfaceImpl.queryWeather("����"));
	}
	
}
