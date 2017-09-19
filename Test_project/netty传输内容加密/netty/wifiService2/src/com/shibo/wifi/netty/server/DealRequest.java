package com.shibo.wifi.netty.server;

import com.shibo.wifi.netty.comm.ProcessFact;
import com.shibo.wifi.netty.comm.ProcessFactInf;
import com.shibo.wifi.netty.entity.TransferData;




/**
 * 功能: 根据协议分发任务 
 * 版本: 1.0 
 * 开发人员: 彭小东 
 * 创建日期: 20161103 
 * 修改日期: 20161103 
 * 修改列表:
 */
public class DealRequest {

	/**
	 * 
	 * 功能：根据协议分发任务 
	 * 开发人员: 彭小东
	 * @param tranData
	 * @return
	 */
	public static String dealResult(TransferData tranData) {
		ProcessFactInf proDeal=ProcessFact.getProDealImp(tranData.getMsg_type(), tranData); 
		if (proDeal==null){
			return "未找到相关协议$";
		}else{
			//执行相关协议
			return proDeal.execute();
		}
	}
}