package com.cz.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

//@WebService��ʾ������һ�������࣬��Ҫ�������е�public�ķ���
@WebService
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherInterfaceImpl implements WeatherInterface{

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client,,,"+cityName);
		String weather=cityName+"������";
		return weather;
	}

}
