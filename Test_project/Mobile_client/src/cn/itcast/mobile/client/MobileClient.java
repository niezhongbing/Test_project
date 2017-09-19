package cn.itcast.mobile.client;

import cn.itcast.mobile.MobileCodeWS;
import cn.itcast.mobile.MobileCodeWSSoap;

public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建服务视图
		MobileCodeWS mobileCodeWS=new MobileCodeWS();
		//获取服务实现类
		MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		
		
		System.out.println(mobileCodeWSSoap.getMobileCodeInfo("18273610921", null));
	}

}
