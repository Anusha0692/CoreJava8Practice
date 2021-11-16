package com.java.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class firstNonRepeatingChar {

	public static void main(String[] args) {
		String word= "anusha";
		Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        System.out.println(nonRepeating);

	}

}
