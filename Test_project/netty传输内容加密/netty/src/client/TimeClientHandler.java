package client;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

import javax.crypto.NoSuchPaddingException;

import encode.AesUtil;
import encode.EncrypAES;
import io.netty.buffer.ByteBuf;

import io.netty.buffer.Unpooled;

import io.netty.channel.ChannelHandlerContext;

import io.netty.channel.ChannelInboundHandlerAdapter;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {

	private static final Logger logger = Logger.getLogger(TimeClientHandler.class.getName());

	private final ByteBuf firstMessage;
	private final EncrypAES de1 = new EncrypAES();  

	public TimeClientHandler() throws Exception, NoSuchPaddingException {
		String req = "我是客户端发送给服务端请求的信息";
		byte[] encrypt = AesUtil.encrypt(req, "123");
		String parseByte2HexStr = AesUtil.parseByte2HexStr(encrypt);
		firstMessage = Unpooled.buffer(parseByte2HexStr.getBytes().length);
		firstMessage.writeBytes(parseByte2HexStr.getBytes());
	}

	@Override

	public void channelActive(ChannelHandlerContext ctx) throws Exception {

		// 与服务端建立连接后

		//System.out.println("client channelActive..");
		ctx.writeAndFlush(firstMessage);
	}

	@Override

	public void channelRead(ChannelHandlerContext ctx, Object msg)

			throws Exception {
		//System.out.println("client channelRead..");

		// 服务端返回消息后

		ByteBuf buf = (ByteBuf) msg;

		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		String body = new String(req);
		byte[] decryptFrom = AesUtil.parseHexStr2Byte(body);  
        byte[] decryptResult = AesUtil.decrypt(decryptFrom, "123");
        String result = new String(decryptResult, "UTF-8");  
		//byte[] decontent = de1.Decryptor(msg.toString().getBytes());  
		System.out.println("Now is :" + result);
	}

	@Override

	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)

			throws Exception {
		//System.out.println("client exceptionCaught..");

		// 释放资源
		logger.warning("Unexpected exception from downstream:" + cause.getMessage());
		ctx.close();
	}

}