package cn.itcast.mobile.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1���������ַ
		URL url=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
		//2��һ��ͨ������ַ������
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		//3���ò��� ���ͷ�ʽ����POST��POST�����д
		connection.setRequestMethod("POST");
		//3.2�������ݸ�ʽ��content-type
		connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
		//3.3���������������ΪĬ��ֵ�´�����connectionû�ж�дȨ��
		connection.setDoInput(true);
		connection.setDoOutput(true);
		//4��֯SOAP���ݣ���������
		String soapXml=getXML("18273610921");
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(soapXml.getBytes());
		//5���ܷ�����Ӧ,��ӡ
		int responseCode = connection.getResponseCode();
		if(responseCode==200){
			InputStream inputStream = connection.getInputStream();
			InputStreamReader in=new InputStreamReader(inputStream);
			BufferedReader br=new BufferedReader(in);
			StringBuffer sb=new StringBuffer();
			String temp=null;
			while (null!=(temp=br.readLine())) {
				sb.append(temp);
			}
			System.out.println(sb.toString());
			br.close();
			in.close();
			inputStream.close();
			outputStream.close();
			
		}else{
			System.out.println();
		}
	}
	public static String getXML(String phoneNum){
		String soapXML="<?xml version=\"1.0\" encoding=\"utf-8\"?>"
+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
 +" <soap:Body>"
 +"   <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">"
    +"  <mobileCode>"+phoneNum+"</mobileCode>"
   +"   <userID></userID>"
   +" </getMobileCodeInfo>"
  +"</soap:Body>"
+"</soap:Envelope>";
		return soapXML;
	}
	

}
