package com.cz.log4j;

import org.apache.log4j.Logger;

public class Log4j {
	private static Integer number=3;
	private static String message="我是string";
	private static Long longs=500L;
	private static Logger logger = Logger.getLogger(Log4j.class); 
	public static void main(String[] args) {
		// System.out.println("This is println message."); 
		 // 记录debug级别的信息 
		 logger.debug("This is debug message."); 
		 // 记录info级别的信息 
		 logger.info("This is info message."); 
		 // 记录error级别的信息 
		 logger.error("This is error message."); 
		 logger.warn(String.format("我是 (int：{}), (string:{}) (Long:{})", number,message,longs));
		 testLog4j();
		 String str="12345678";
		 logger.info(str.substring(0, 2));
	}

	public static void testLog4j(){
		 logger.info("This is info testLog4j."); 
		 // 记录error级别的信息 
		 logger.error("This is error testLog4j."); 
	}                                                                                           
	
}
