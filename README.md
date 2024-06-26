﻿# TriePrefixSearch
## Project Description
This repository contains a Java program that implements a node-based trie (prefix tree). The program reads words from a given text file and inserts them into the trie. It then finds the longest prefix of a given input word that exists in the trie.

## Files
- `Node.java`: Defines the node structure used in the trie.
- `Main.java`: Main class to handle the input parsing, trie operations, and output of the longest prefix.
- `dict.txt`: Sample dictionary file containing words to be inserted into the trie.

## Algorithm Explanation

### Node Class
The `Node` class defines the basic unit of the trie. Each node contains:
- A character (`char value`): The character stored in the node.
- A map of children nodes (`Map<Character, Node> children`): Points to the children of the node.
- A boolean (`boolean isEndOfWord`): Indicates if the node represents the end of a word.

### Trie Operations
The trie supports the following operations:
- `insert(String word)`: Inserts a new word into the trie.
- `findLongestPrefix(String input)`: Finds the longest prefix of the input word that exists in the trie.

### Main Class
The `Main` class contains the main method to run the trie prefix search application:
- Parses the input arguments to extract the dictionary file name.
- Reads the words from the dictionary file and inserts them into the trie.
- Takes user input and uses the trie to find the longest prefix of the input word.
- Prints the longest prefix or "Mevcut degil." if no prefix is found.

### Example Workflow
1. The user inputs the dictionary file as a command line argument:
2. The program reads the words from `dict.txt` and constructs the trie.
3. The program prompts the user for an input word.
4. The program finds the longest prefix of the input word in the trie and prints the result.

### Example Usage
For the given `dict.txt`:
Bilgisayar
Araba
İnternet
Kedi
Kalem
Example :
Input:
kalemlik
Output:
kalem
