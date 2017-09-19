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
		//����WSDL��URL��ע�ⲻ�Ƿ����ַ
		URL url=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		//������������
		//1.namespaceURI -�����ռ��ַ
		//2.������ͼ��
		QName qname=new QName("http://WebXml.com.cn/", "MobileCodeWS");
		//������ͼ
		//1.WSDL��URL,
		//2.��������
		Service service = Service.create(url, qname);
		//��ȡ����ʵ����
		MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
		//���ò�ѯ����
		System.out.println(mobileCodeWSSoap.getMobileCodeInfo("18273610921", null));
	}

}
