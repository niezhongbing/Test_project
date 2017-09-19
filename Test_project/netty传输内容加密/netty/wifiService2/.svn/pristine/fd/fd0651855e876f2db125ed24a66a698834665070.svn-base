package com.shibo.wifi.netty.entity;

import java.util.HashMap;

import com.google.gson.Gson;
import com.shibo.wifi.netty.comm.ServerConfig;

/**
 * 
 * 功能:解析交易数据
 * 版本: 1.0
 * 开发人员: 彭小东
 * 创建日期: 2015-8-7
 * 修改日期: 2015-8-7
 * 修改列表:
 */
public class TransferData 
{
    /**
     * 包头map
     */
    private String msg_type;
    private String msg_id;
    private String device_id;
    /**
     * 包体集合
     */
    private GpsPoint point;
    
    
   public TransferData()
    {
       
    }
   /**
    * 构造对象
    * @param str
    */
   public TransferData(String str)
   {
       String []body=str.split(ServerConfig.MessageSplitLine);
       headInit(body[0],body[2],body[3]);
       bodyInit(body[1]);
   }
  
   
   /**
    *    msg_type=notify
    *    
    *     msg_id=e992500cd7364963ad88c0ce8cfced7e&device_id=8A84E736-7B19-4A0D-88C6-ACB1359F5826
    * 功能：解析包头
    * 开发人员: 彭小东
    * @param head
    */
    private void headInit(String head1,String head2,String head3)
    {
        String[] type=head1.split(ServerConfig.MessageSplitVale);
        msg_type=type[1];
        String[] Msgid=head2.split(ServerConfig.MessageSplitVale);
        msg_id=Msgid[1];
        String[] deviceId=head3.split(ServerConfig.MessageSplitVale);
        device_id =deviceId[1];
        
    }


    /**
     * 
     * data={"protocol_type":"5","vs_report_time":"20161103081449","vs_upload_type":"0","vs_lamp_high":"3","vs_lamp_low":"3","vs_lamp_bulb":"3","vs_lamp_fog":"3","vs_lamp_lt":"3","vs_lamp_rt":"3","vs_lamp_hazard":"3","vs_door_lf":"3","vs_door_rf":"3","vs_door_lb":"3","vs_door_rb":"3","vs_door_trunk":"3","vs_lock_all":"3","vs_lock_lfd":"3","vs_lock_rfd":"3","vs_lock_lbd":"3","vs_lock_rbd":"3","vs_lock_trunk":"3","vs_window_lf":"3","vs_window_rf":"3","vs_window_lb":"3","vs_window_rb":"3","vs_window_sky":"3","vs_fs_ecm":"3","vs_fs_abs":"3","vs_fs_srs":"3","vs_as_engine_oil":"3","vs_as_tire_pressure":"3","vs_as_maintain":"3","vs_airbag_status":"3","vs_handbrake_status":"3","vs_footbrake_status":"3","vs_safety_belt":"3","vs_safety_belt_copilot":"3","vs_acc":"3","vs_key_status":"3","vs_rcs":"7","vs_wiper_status":"3","vs_aircondi_switch":"3","vs_gear":"0"}
     * 功能：解析包体
     * 开发人员: 彭小东
     * @param body
     */
    private void bodyInit(String body)
    {
        Gson gson = new Gson();
        point = gson.fromJson(body.split(ServerConfig.MessageSplitVale)[1], GpsPoint.class);
    }
  

    
    public GpsPoint getPoint() {
    
        return point;
    }
    
    public void setPoint(GpsPoint point) {
    
        this.point = point;
    }
    
    public String getMsg_type() {
    
        return msg_type;
    }
    
    public void setMsg_type(String msg_type) {
    
        this.msg_type = msg_type;
    }
    
    public String getMsg_id() {
    
        return msg_id;
    }
    
    public void setMsg_id(String msg_id) {
    
        this.msg_id = msg_id;
    }
    
    public String getDevice_id() {
    
        return device_id;
    }
    
    public void setDevice_id(String device_id) {
    
        this.device_id = device_id;
    }

    

}
