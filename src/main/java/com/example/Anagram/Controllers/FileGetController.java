package com.example.Anagram.Controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class FileGetController {

    @PostMapping("/upload")
    public List<String> listOfWords(@RequestBody Map<String, List<String>> payload){
        List<String> words = payload.get("lines");
        return words;
    }
}
