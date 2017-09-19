package com.shibo.wifi.netty.client;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class ChannelHandler extends ChannelInitializer<SocketChannel>{

	@Override
	protected void initChannel(SocketChannel sc) throws Exception {
//	    sc.pipeline().addLast(new IdleStateHandler(5, 5, 0)); //处理时间?  秒
	    ByteBuf delimiter = Unpooled.copiedBuffer("$".getBytes());
        sc.pipeline().addLast(new DelimiterBasedFrameDecoder(1024,delimiter));
        sc.pipeline().addLast("decoder", new StringDecoder());
        sc.pipeline().addLast("encoder", new StringEncoder()); 
		sc.pipeline().addLast("handler", new ClientHandler());
	}

}
