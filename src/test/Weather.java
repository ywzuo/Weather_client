package test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class Weather {
	public static void main(String[] args) {
        //创建一个WeatherWS工厂
		WeatherWebService factory = new WeatherWebService();
        //根据工厂创建一个WeatherWSSoap对象
		WeatherWebServiceSoap weatherWSSoap = factory.getWeatherWebServiceSoap();
        //调用WebService提供的getWeather方法获取南宁市的天气预报情况
        ArrayOfString weatherInfo = weatherWSSoap.getWeatherbyCityName("上海");
        List<String> lstWeatherInfo = weatherInfo.getString();
        //遍历天气预报信息
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}
