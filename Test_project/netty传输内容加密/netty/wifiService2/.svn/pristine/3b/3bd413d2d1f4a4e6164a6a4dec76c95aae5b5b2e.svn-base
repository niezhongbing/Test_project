package com.shibo.wifi.netty.codec;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

import com.shibo.wifi.netty.entity.TransferData;

/**
 * 功能: 将字符串解码为TransferDataPOJO对象
 * 版本: 1.0
 * 开发人员: pengxiaodong
 * 创建日期: 20161103
 * 修改日期: 20161103
 * 修改列表: 
 */
public class MessageToPOJO extends MessageToMessageDecoder<String>{

	@Override
	protected void decode(ChannelHandlerContext ctx, String msg,
			List<Object> out) throws Exception {
		TransferData tranData = new TransferData(msg);
		out.add(tranData);
	}

 

 

}
