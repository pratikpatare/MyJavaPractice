package fajavaprogram;

import java.util.HashMap;

public class S_CountOccuranceOfEachCharHashMap {

	public static void main(String[] args) {
		
		String str="Java";
		HashMap<Character, Integer> charMapCount = new HashMap<>();
		
		for(Character c:str.toCharArray()) {
			if(charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c)+1);
			}else {
				charMapCount.put(c, 1);
			}
		}
		System.out.println(charMapCount);
	}

}
