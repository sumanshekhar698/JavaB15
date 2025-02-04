package com.java.oops.maps;

import java.util.HashMap;

public class MakeAFrequencyMap {

	public static void main(String[] args) {
		String str = "it was very ColD nIght.";// case insensitive
		str= str.toLowerCase();

		HashMap<Character, Integer> map = new <Character, Integer>HashMap();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}
		
		System.out.println(map);
	}

}
