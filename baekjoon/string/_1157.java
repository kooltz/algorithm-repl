package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class _1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] alphabet = new int[26];

    String word = br.readLine();
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (c >= 97) {
        c -= 32;
      }
      alphabet[c - 65]++;      
    }

    char maxChar = '?';
    int maxCount = 0;
    for (int j = 0; j < 26; j++) {
      if (maxCount < alphabet[j]) {
        maxChar = (char)(j + 65);
        maxCount = alphabet[j];
      }
      else if (maxCount == alphabet[j]) {
        maxChar = '?';
      }      
    }
    System.out.println(maxChar);
    
    br.close();
  }
}