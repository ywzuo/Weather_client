package test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class Weather {
	public static void main(String[] args) {
        //����һ��WeatherWS����
		WeatherWebService factory = new WeatherWebService();
        //���ݹ�������һ��WeatherWSSoap����
		WeatherWebServiceSoap weatherWSSoap = factory.getWeatherWebServiceSoap();
        //����WebService�ṩ��getWeather������ȡ�����е�����Ԥ�����
        ArrayOfString weatherInfo = weatherWSSoap.getWeatherbyCityName("�Ϻ�");
        List<String> lstWeatherInfo = weatherInfo.getString();
        //��������Ԥ����Ϣ
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}
