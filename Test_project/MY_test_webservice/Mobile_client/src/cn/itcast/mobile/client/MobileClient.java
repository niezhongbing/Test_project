package cn.itcast.mobile.client;

import cn.itcast.mobile.MobileCodeWS;
import cn.itcast.mobile.MobileCodeWSSoap;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����������ͼ
		MobileCodeWS mobileCodeWS=new MobileCodeWS();
		//��ȡ����ʵ����
		MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		
		
		System.out.println(mobileCodeWSSoap.getMobileCodeInfo("18273610921", null));
	}

}
