package com.shibo.wifi.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.util.logging.Logger;

import com.shibo.wifi.netty.codec.MessageToPOJO;


/**
 * 项目名称：transaction    
 * 类名称：ChannelHandler    
 * 类描述： 服务端句柄   
 * 创建人：彭小东   
 * 创建时间：2015-7-25 上午8:21:38    
 * 修改人：Administrator    
 * 修改时间：2015-7-25 上午8:21:38    
 * 修改备注：    
 * @version     
 *
 */

public class ChannelHandler extends ChannelInitializer<SocketChannel> {

    private static final Logger log=Logger.getLogger("ChannelHandler");
    @Override
    protected void initChannel(SocketChannel sc) throws Exception {
        ByteBuf delimiter = Unpooled.copiedBuffer("$".getBytes());
        sc.pipeline().addLast(new DelimiterBasedFrameDecoder(10240,delimiter));
        sc.pipeline().addLast("decoder", new StringDecoder());
        sc.pipeline().addLast("decoderPOJO", new MessageToPOJO());
        sc.pipeline().addLast("encoder", new StringEncoder()); 
        sc.pipeline().addLast(new HandlerAdapter());
        //客户端连接
        log.info("客户端连接"+sc.localAddress().getAddress().getHostAddress());
       
    }

}
