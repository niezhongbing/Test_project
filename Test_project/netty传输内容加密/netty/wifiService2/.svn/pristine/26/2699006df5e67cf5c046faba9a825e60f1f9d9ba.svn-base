package com.shibo.wifi.netty.server;

import org.apache.log4j.Logger;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * 项目名称：transaction    
 * 类名称：NettyServer    
 * 类描述：    netty服务端入口
 * 创建人：彭小东   
 * 创建时间：2015-7-25 上午8:27:09    
 * 修改人：Administrator    
 * 修改时间：2015-7-25 上午8:27:09    
 * 修改备注：    
 * @version     
 *
 */

public class NettyServer {

    private static final Logger log = Logger.getLogger(NettyServer.class);
    /**
     * 
     * 功能：netty服务端入口 
     * 开发人员: 彭小东
     * @param port
     * @throws Exception
     */
    public void bing(int port) throws Exception {

        // 服务器线程组 用于网络事件的处理 一个用于服务器接收客户端的连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 另一个线程组用于处理SocketChannel的网络读写
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {

            // NIO服务器端的辅助启动类 降低服务器开发难度
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap
                    .group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    // 类似NIO中serverSocketChannel
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    // 配置TCP参数
                    // 通过NoDelay禁用Nagle,使消息立即发出去，不用等待到一定的数据量才发出去
                    .option(ChannelOption.TCP_NODELAY, true)
                    // 保持长连接状态
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChannelHandler());// 最后绑定I/O事件的处理类
                                                        // 处理网络IO事件
            // 服务器启动后 绑定监听端口 同步等待成功 主要用于异步操作的通知回调 回调处理用的ChildChannelHandler
            ChannelFuture f = serverBootstrap.bind(port).sync();
            log.info("wifi采集系统netty服务端开启");
            // 等待服务端监听端口关闭
            f.channel().closeFuture().sync();

        }
        finally {
            // 退出 释放线程池资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
            log.info("wifi采集系统netty服务端关闭");

        }

    }

    public static void main(String[] args) {

        NettyServer nettyServerManage = new NettyServer();
        try {
            nettyServerManage.bing(55555);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
