package server;

import java.util.Date;

import encode.AesUtil;
import encode.EncrypAES;
import io.netty.buffer.ByteBuf;

import io.netty.buffer.Unpooled;

import io.netty.channel.ChannelHandlerContext;

import io.netty.channel.ChannelInboundHandlerAdapter;

public class TimeServerHandler extends ChannelInboundHandlerAdapter {

	@Override

	public void channelRead(ChannelHandlerContext ctx, Object msg)

			throws Exception {
		
		// System.out.println("server channelRead..");
		ByteBuf buf = (ByteBuf) msg;

		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		String body = new String(req);
		byte[] decryptFrom = AesUtil.parseHexStr2Byte(body);  
        byte[] decryptResult = AesUtil.decrypt(decryptFrom, "123");
        String result = new String(decryptResult, "UTF-8");  
		System.out.println("The time server receive order: " + result);
		/*String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new Date(System.currentTimeMillis()).toString()
				: "BAD ORDER";*/
		String currentTime="我是服务端发送给客服的请求信息";
		byte[] encrypt = AesUtil.encrypt(currentTime, "123");
		String parseByte2HexStr = AesUtil.parseByte2HexStr(encrypt);
		ByteBuf resp = Unpooled.copiedBuffer(parseByte2HexStr.getBytes());
		ctx.write(resp);
	}

	@Override

	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		//System.out.println("server channelReadComplete..");
		ctx.flush();
		// =刷新后才将数据发出到SocketChannel

	}

	@Override

	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)

			throws Exception {
		//System.out.println("server exceptionCaught..");
		ctx.close();
	}

}
