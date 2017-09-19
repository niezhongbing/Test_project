/**
 * 
 */
package com.shibo.wifi.netty.comm;

import com.shibo.wifi.netty.entity.TransferData;

/**
 * 功能:执行协议 
 * 版本: 1.0 
 * 开发人员: pengxiaodong 
 * 创建日期: 20161103 
 * 修改日期: 20161103 
 * 修改列表:
 */
public class ProcessFact {
	public static ProcessFactInf getProDealImp(String cmd, TransferData tranData) {
		// 根据相关命令，执行相关协议。
		if (cmd.equals("notify")) {
			return new ProWifiNotify(tranData.getPoint());
		}  else {
			return null;
		}
	}

}
