package com.string_programs;

public class LexicograpgicallySmallestStringAfterModification {

	public static void main(String[] args) {
		String str = "hackerrank";
		String res = getSmallestString(str);
		System.out.println("The lexicographically smallest string : " + res);

	}

	private static String getSmallestString(String str) {
		char[] arr = str.toCharArray();
		boolean modified = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				if (modified)
					break;
				continue;
			}
			modified = true;
			arr[i] = (char) (arr[i] - 1);
		}
		if (!modified)
			arr[arr.length - 1] = (char) (arr[arr.length - 1] - 1);
		return new String(arr);
	}

}


/*
 
 ip - hackerrank
 op - gackerrank
 
 */
