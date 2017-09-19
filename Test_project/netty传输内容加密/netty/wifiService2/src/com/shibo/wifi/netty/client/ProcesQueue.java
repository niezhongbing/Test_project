package com.shibo.wifi.netty.client;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProcesQueue
{
    
    private static  ProcesQueue procesQueue = null;
    private  BlockingQueue<String> requestQueue;//请求的队列

    
    public ProcesQueue()
    {
        requestQueue = new LinkedBlockingQueue<String>(1000);
 
        int i=0;
        while(i<10){
            try
            {
                i++;
                int j=(int) (Math.random()*i*10000);
                String res="msg_type=notify&data={'protocol_type':'5','vs_report_time':'20161103081449','vs_upload_type':'0','vs_lamp_high':'3','vs_lamp_low':'3','vs_lamp_bulb':'3','vs_lamp_fog':'3','vs_lamp_lt':'3','vs_lamp_rt':'3','vs_lamp_hazard':'3','vs_door_lf':'3','vs_door_rf':'3','vs_door_lb':'3','vs_door_rb':'3','vs_door_trunk':'3','vs_lock_all':'3','vs_lock_lfd':'3','vs_lock_rfd':'3','vs_lock_lbd':'3','vs_lock_rbd':'3','vs_lock_trunk':'3','vs_window_lf':'3','vs_window_rf':'3','vs_window_lb':'3','vs_window_rb':'3','vs_window_sky':'3','vs_fs_ecm':'3','vs_fs_abs':'3','vs_fs_srs':'3','vs_as_engine_oil':'3','vs_as_tire_pressure':'3','vs_as_maintain':'3','vs_airbag_status':'3','vs_handbrake_status':'3','vs_footbrake_status':'3','vs_safety_belt':'3','vs_safety_belt_copilot':'3','vs_acc':'3','vs_key_status':'3','vs_rcs':'7','vs_wiper_status':'3','vs_aircondi_switch':'3','vs_gear':'0'}&msg_id=e992500cd7364963ad88c0ce8cfced7e&device_id=8A84E736-7B19-4A0D-88C6-ACB1359F5826";
                requestQueue.put(res+"$");
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
    }
    


    private static synchronized ProcesQueue init(){
        if(procesQueue==null){
            procesQueue=new ProcesQueue();
        }
        return procesQueue;
    }
       
    public static ProcesQueue getInstance(){
        if(procesQueue==null){
           init();
        }
        return procesQueue;
        
    }
    
    public int requestSize(){
        return requestQueue.size();
    }
    
  
    public  String getRequest()
    {
        try
        {
            return requestQueue.take().toString();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
           return null;
        }
    }
    public  void putRequest(String request)
    {
        
             try
            {
                 requestQueue.put(request);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
       
    }
  

}
