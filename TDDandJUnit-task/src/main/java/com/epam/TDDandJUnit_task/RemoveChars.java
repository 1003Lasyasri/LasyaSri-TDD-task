package com.epam.TDDandJUnit_task;

public class RemoveChars {
	
	public String remove(String string) {
		String result="";
		
		if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			result=string.substring(2);
		}
		else if(string.charAt(0)=='A')
		{
			result=string.substring(1);
		}
		else if(string.charAt(1)=='A')
		{
			result=string.charAt(0)+string.substring(2);
		}
		else
		{
			result=string;
		}
		
		return result;
	}


}
