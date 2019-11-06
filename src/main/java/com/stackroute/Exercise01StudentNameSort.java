package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Complete the code below as given in the problem.md file
public class Exercise01StudentNameSort {
	public static String[] sortStudents(String[] studentNames, int[] percentage) {
	    List<String> sortedNames = new ArrayList<>();
	    String[] sortedArray;
		Map<Integer,String> map = new HashMap<>();
		for(int i=0;i<studentNames.length;i++) {
			map.put(percentage[i], studentNames[i]);
		}
		
		Map<Integer,String> sortedMap = new TreeMap<Integer,String>(map);

		sortedArray = sortedMap.values().toArray(new String[sortedMap.size()]);
		
		return sortedArray;
	}
	
	//Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		//Use Scanner to get input from console
		String[] studNames = null;
		int[] percentage = null;
		String[] sortNames= null;
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(null != str) {
			String[] eStu = str.split(";");
			if(eStu != null) {
				studNames = new String[eStu.length];
				percentage = new int[eStu.length];
				for(int i = 0; i < eStu.length; i++) {
					String stu = eStu[i];
					String[] data = stu.split(":");
					if(null != data) {
						studNames[i] = data[0].replace("\\s+", "");
						percentage[i] = Integer.parseInt(data[1]); 
					}
				}
			}
		}
			
		sortNames=sortStudents(studNames,percentage);
				
		System.out.println(Arrays.toString(sortNames));
	}
}