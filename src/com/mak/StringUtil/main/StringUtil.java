package com.mak.StringUtil.main;

public class StringUtil {

	
	public static boolean isNullOrEmpty(String str){
		
		if( str == null)
			return true;
		
		if( str.length() == 0 )
			return true;
		
		return false;
	}
	
}
