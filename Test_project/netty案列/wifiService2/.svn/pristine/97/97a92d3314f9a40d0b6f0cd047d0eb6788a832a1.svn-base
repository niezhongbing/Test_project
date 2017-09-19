package com.shibo.wifi.netty.client;



public class ClientThread implements Runnable{
	
    private String ip;
    private int port;
	public ClientThread(String ip, Integer port)
    {
        this.ip=ip;
        this.port=port;
    }

    public void run() {
		NettyClient nc = new NettyClient();
		try {
			nc.connect(port ,ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
