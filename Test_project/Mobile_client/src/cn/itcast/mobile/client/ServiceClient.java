package cn.itcast.mobile.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.itcast.mobile.MobileCodeWSSoap;

public class ServiceClient {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub
		//创建WSDL的URL，注意不是服务地址
		URL url=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		//创建服务名称
		//1.namespaceURI -命名空间地址
		//2.服务视图名
		QName qname=new QName("http://WebXml.com.cn/", "MobileCodeWS");
		//创建视图
		//1.WSDL的URL,
		//2.服务名称
		Service service = Service.create(url, qname);
		//获取服务实现类
		MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
		//调用查询方法
		System.out.println(mobileCodeWSSoap.getMobileCodeInfo("18273610921", null));
	}

}
