package com.inflearn.algoritm;

import java.util.*;

class Main {	
	public String solution(String a, String b){
		HashMap<Character, Integer> hash1 = new HashMap<>();
		HashMap<Character, Integer> hash2 = new HashMap<>();
		for(int i=0; i<a.length(); i++) {
			hash1.put(a.charAt(i), hash1.getOrDefault(a.charAt(i), 0)+1);
			hash2.put(b.charAt(i), hash2.getOrDefault(b.charAt(i), 0)+1);
		}
		
		String isAna = "YES";
		for(Character key : hash1.keySet()) {
			if(hash1.get(key) != hash2.get(key)) {
				isAna = "NO";
				break;
			} 
		}
		
		return isAna;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}
}