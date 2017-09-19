package com.cz.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

//@WebService表示该类是一个服务类，需要发布其中的public的方法
@WebService
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherInterfaceImpl implements WeatherInterface{

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client,,,"+cityName);
		String weather=cityName+"，，晴";
		return weather;
	}

}
