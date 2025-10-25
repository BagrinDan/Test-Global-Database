# Test-Global-Database

# Anagram Finder - Spring Boot Backend

## Overview
This Spring Boot application provides a REST API to receive a list of words and return grouped anagrams. Words are considered anagrams if they contain the same letters but in a different order (e.g., "race" and "care").

The backend is designed to work together with Python scripts that read input files and send them via HTTP requests.


## Project Structure

├── PythonsScripts
│   ├── FileReader.py
│   ├── __pycache__
│   │   └── FileReader.cpython-313.pyc
│   ├── sample.txt
│   └── SendWordsAPI.py
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── Anagram
│   │   │               ├── AnagramApplication.java
│   │   │               ├── Controllers
│   │   │               │   └── AnagramController.java
│   │   │               └── Solution
│   │   │                   ├── AnagramSolution.java
│   │   │                   └── Interfaces
│   │   │                       └── BehaviourAnagramSolution.java


# Anagram Finder Project

This project demonstrates an anagram finder application using a combination of Spring Boot (Java) and Python. The Python scripts read an input file and send its contents to the Spring Boot application via a REST API. The Spring Boot service groups the words into anagrams and exposes them via an endpoint.

---

## How it works

1. **Python scripts**:
   - `FileReader.py` reads a text file line by line and returns a list of words.
   - `SendWordsAPI.py` sends the list of words to the Spring Boot application via a POST request.

2. **Spring Boot application**:
   - Exposes a `/upload` endpoint to receive the list of words.
   - Uses the `AnagramSolution` service to group words into anagrams.
   - Provides a `/list` endpoint to retrieve the grouped anagrams.

---

## How to run

1. Launch the Spring Boot application:

   ```bash
   ./mvnw spring-boot:run

   or by IntelijIdea

2. Navigate to the PythonScripts/ directory (where the Python scripts are located).

3. Run the SendWordsAPI.py. 

4. Write file path (sample.txt will be in same direcotry, so you need just to write file name)

5. Navigate to http://localhost:8080/list to see result
