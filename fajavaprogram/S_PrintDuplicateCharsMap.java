package fajavaprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class S_PrintDuplicateCharsMap {

	public static void main(String[] args) {
		String x="softwaretesting";
		char y[]=x.toCharArray();
		int size=y.length;
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		for(Map.Entry<Character,Integer> data:lhmap)
		{
			if(data.getValue()>1) 
			{
				System.out.print(data.getKey());
				System.out.println(data.getValue());
			}	
		}	
			
	}

}
