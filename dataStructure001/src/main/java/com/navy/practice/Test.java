package com.navy.practice;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
        String str = "AAFE";
        Map<String, Integer> map = new HashMap<String, Integer>();
        char c2 = 'A';
        for(int i = 1; i <= 26; i++){
            map.put(String.valueOf(c2), 0);
            c2++;
        }
        for(int i = 0; i < str.length()-1; i++){
            String s = str.substring(i, i+1);
            if(map.get(s) == 0){
                map.put(s, 1);
            }
            else{
                Integer count = map.get(s) + 1;
                map.put(s, count);
            }
        }
        
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
	}
}
