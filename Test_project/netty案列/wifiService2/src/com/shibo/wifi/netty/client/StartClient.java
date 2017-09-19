package com.shibo.wifi.netty.client;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;







public class StartClient
{

    
    public static void main(String[] args) {
        
        StartClient mm = new StartClient();
   
     new Thread( new ClientThread("127.0.0.1", 55555)).start();
     new Thread( new RequestThread()).start();
    System.out.println("线程启动完成");
     while(true){
         try {
             Thread.sleep(1000);
         }
         catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }         
     }
        
    }
    
    
}
