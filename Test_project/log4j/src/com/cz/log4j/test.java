package com.cz.log4j;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class test2{
	protected static final Map<String, Object> mapObject = new HashMap<String, Object>();
	protected static final String str = "寮犱笁";
}
public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*String str="12312";
		boolean startsWith = str.startsWith("1231");
		boolean bool=str.substring(0, 4).equals("1232");
		System.out.println(bool+"--"+startsWith);
		
		double b=9.0;
		double b2=8.0;
		 DecimalFormat df = new DecimalFormat("#.00");
		         System.out.println(df.format(b2/b));
		
		double  d= 3.1415926;
		int i=5,j=10;
		double dd = Double.parseDouble(""+(5+10)) / 100;
		System.out.println(dd);
		System.out.println(String.format("%.2f", d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date date1 = new Date();
		date1.setDate(date1.getDay());
		String format1 = "2017-09-15 12:48:30";		
		Date date2 = new Date();
		String format2 = "2017-09-10 12:48:30";
		System.out.println("format1:" + format1 + ", format2:" + format2);
		
		
		Date  smdate = sdf.parse(format2);
		Date bdate = sdf.parse(format1);
        final Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        final long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        final long time2 = cal.getTimeInMillis();
        final long between_days = (time2 - time1) / (1000 * 3600 );
        
         System.out.println( Integer.parseInt(String.valueOf(between_days)));*/
         
        /* List list=null;
         Map map=null;
         if (list == null || list.size() == 0 )
         System.out.println("鍒ゆ柇姝ｇ‘");
         test2.mapObject.put("1", "2");
         System.out.println(test2.mapObject.get("1"));
         System.out.println("abcd".charAt(0));
         System.out.println(System.getProperty("java.home"));
         int num [] = {399,398,397,396,395,299,290,311,301};
         int score[] = {81,85,59,77,90,66,89,93,73};
         int imax,ipos,i;
         ipos=0;
         imax=score[ipos];
         for ( i = 0; i < 9; i++) {
			if(score[i]> imax ){
				ipos=i;
		        imax=score[ipos];
			}
			System.out.println(String.format("num=%d,score=%d", num[ipos],score[ipos]));
		}*/
		
		  		  int number = 10;
		          //原始数二进制
		          printInfo(number);
		          number = number << 3;
		          //左移一位
		          printInfo(number);
		          number = number >> 3;
		          //右移一位
		          printInfo(number);
		          List<String> listStr=new ArrayList<String>();
		          listStr.add("1");
		          listStr.add("2");
		          listStr.add("3");
		          listStr.add(0, "-1");
		          for (String string : listStr) {
					System.out.println(string);
				}
		      }
		      
		      /**
		       * 输出一个int的二进制数
		       * @param num
		       */
		      private static void printInfo(int num){
		          System.out.println(num);
		      }

}
