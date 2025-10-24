package com.example.Anagram.Controllers;

// Spring Packages
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Java Packages
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Project Package
import com.example.Anagram.Solution.Interfaces.BehaviourAnagramSolution;

@RestController
public class AnagramController {
    private final BehaviourAnagramSolution behaviourAnagramSolution;
    List<String> answer = new ArrayList<>();

    public AnagramController(BehaviourAnagramSolution behaviourAnagramSolution){
        this.behaviourAnagramSolution = behaviourAnagramSolution;
    }

    // Get list of words from API
    @PostMapping("/upload")
    public String getStampleList(@RequestBody Map<String, List<String>> payload){
        this.answer = payload.get("lines");
        return "Let's see what we got: " + answer.size();
    }

    // Return anogram list
    @GetMapping("/list")
    public List<List<String>> anagramSolution(){
        Map<String, List<String>> result = behaviourAnagramSolution.AnagramSortMethod(answer);
        return new ArrayList<>(result.values());
    }
}
