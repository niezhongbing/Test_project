package com.shibo.wifi.netty.client;

import org.apache.log4j.Logger;

import com.shibo.wifi.netty.server.NettyServer;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class NettyClient {
    private static final Logger log = Logger.getLogger(NettyClient.class);
    private SocketChannel socketChannel;
	public void connect(int inetPort,String inetHost){
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap b = new Bootstrap();
			b.group(group).channel(NioSocketChannel.class)
			 //通过NoDelay禁用Nagle,使消息立即发出去，不用等待到一定的数据量才发出去
            .option(ChannelOption.TCP_NODELAY, true)
			.handler(new ChannelHandler());
			//发起异步连接操作
			ChannelFuture f = b.connect(inetHost, inetPort);
			 if (f.isSuccess()) {
                 socketChannel = (SocketChannel)f.channel();
                 log.info("客户端连接成功");
			 }
			
			//等待客户端链路关闭
			f.channel().closeFuture().sync();
			
			  
		       
		}catch (Exception e) {
        e.printStackTrace(); 
		}finally{
			group.shutdownGracefully();
		}
	}

	
	
	
}
