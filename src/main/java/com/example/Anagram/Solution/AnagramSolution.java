package com.example.Anagram.Solution;

// Spring Packages
import com.example.Anagram.Solution.Interfaces.BehaviourAnagramSolution;
import org.springframework.stereotype.Service;

// Java Packages
import java.util.*;

@Service
public class AnagramSolution implements BehaviourAnagramSolution {
    // Sort Method
    @Override
    public Map<String, List<String>> AnagramSortMethod(List<String> words){
        Map<String, List<String>> hmap = new HashMap<>();

        for(String word : words){
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String key = new String(wordArray);

            hmap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        for (List<String> group : hmap.values()) {
            System.out.println(String.join(" ", group));
        }

        return hmap;
    }
}
