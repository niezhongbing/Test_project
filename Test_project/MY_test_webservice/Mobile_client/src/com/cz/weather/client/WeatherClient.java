package com.cz.weather.client;

import java.util.List;

import com.cz.weather.ArrayOfString;
import com.cz.weather.WeatherWS;
import com.cz.weather.WeatherWSSoap;

public class WeatherClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherWS weatherWS=new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);
		ArrayOfString arrayOfString = weatherWSSoap.getWeather("…œ∫£", "");
		List<String> string = arrayOfString.getString();
		for (String str : string) {
			System.out.println(str);
		}
	}

}
