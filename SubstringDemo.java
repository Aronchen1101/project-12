package com.chyx.test;

/*编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。 
 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
 * 应该输出为“我ABC”而不是“我ABC+汉的半个”*/
public class SubstringDemo {
	 public static void main(String[] args) {
	        String srcStr2 = "我ABC汉DEF";

	        String str = splitString(srcStr2, 6);
	        System.out.println(str);
	    }

	    public static String splitString(String str, int len) {
	    	if(str==null||"".equals(str)||len<1) {
	    		return "出错了";
	    	}
	    	byte[] bts = str.getBytes();
	    	int btslen = bts.length;
	    	if(len>btslen) {//输入长度大于字节数组长度，就取整个字符串
	    		return str;
	    	}else{
	    		while(bts[len-1]<0) {
	    			len--;
	    		}
	    		return new String(bts,0,len);
	    	}
	    	
	    }
}
