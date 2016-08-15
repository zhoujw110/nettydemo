package com.nettydemo;

/** 
 *   
 * 心跳检测的消息类型 
 */  
public class PingMsg extends BaseMsg {  
    public PingMsg() {  
        super();  
        setType(MsgType.PING);  
    }  
} 
