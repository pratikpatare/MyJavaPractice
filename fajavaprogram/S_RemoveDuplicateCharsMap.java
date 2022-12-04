package fajavaprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class S_RemoveDuplicateCharsMap {

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
		String res="";
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		for(Map.Entry<Character,Integer> data:lhmap)
		{
			res=res+data.getKey();
		}
		System.out.println(res);

	}

}
