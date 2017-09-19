package com.shibo.wifi.netty.server;


import org.apache.log4j.Logger;

import com.shibo.wifi.netty.entity.TransferData;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;


/**
 * 项目名称：transaction    
 * 类名称：HandlerAdapter    
 * 类描述：    服务端适配器  处理不同连接的请求
 * 创建人：彭小东   
 * 创建时间：2015-7-25 上午8:24:05    
 * 修改人：Administrator    
 * 修改时间：2015-7-25 上午8:24:05    
 * 修改备注：    
 * @version     
 *
 */
public class HandlerAdapter extends ChannelHandlerAdapter {

    private static final Logger log = Logger.getLogger(HandlerAdapter.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

//        System.out.println("HandlerAdapter");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("客户端断开连接");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception
    {
    	String result=DealRequest.dealResult((TransferData)msg);
        System.out.println("处理结果"+result);
    	ByteBuf echo = Unpooled.copiedBuffer(result.getBytes());
         ctx.writeAndFlush(result+"$");
         
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception
    {

        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception
    {

        ctx.close();
    }

}
