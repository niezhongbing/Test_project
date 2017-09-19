package com.shibo.wifi.netty.client;


import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.shibo.wifi.netty.encode.EncrypAES;



public class HandleService
{
      
       public static ChannelHandlerContext channel;
    
       static public void doSendMsgStr(String msgStr){
           while(channel==null){
               try
               {
                   Thread.sleep(1000);
                   System.out.println(channel);
               }
               catch (InterruptedException e)
               {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
           }
           //System.out.println(channel);
           channel.writeAndFlush(Unpooled.copiedBuffer(msgStr.getBytes()));
       }
   

       
   


    
    
}
