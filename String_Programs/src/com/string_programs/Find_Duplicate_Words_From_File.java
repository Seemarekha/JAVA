package com.string_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_Words_From_File {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "C:\\Users\\hp\\Documents\\Examples\\input.txt";

		try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
			String line;
			Map<String, Integer> map = new HashMap<String, Integer>();

			while ((line = bf.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");  // split by non-word characters
				for (String word : words) {
					if (!word.isEmpty()) {
						map.put(word, map.getOrDefault(word, 0) + 1);
					}
				}
			}

			System.out.println("Duplicate words : ");

			map.entrySet().stream().filter(e -> e.getValue() > 1)
					.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


/********* OUTPUT *************/

/*

Duplicate words : 
world -> 2
java -> 2
hello -> 2

*/