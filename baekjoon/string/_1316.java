package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        Map<String, Boolean> charMap = new HashMap<>();
        
        String prevChar = "";
        for (int i = 0; i < word.length(); i++) {
            String c = String.valueOf(word.charAt(i));
            
            if (charMap.get(c) != null && !prevChar.equals(c)) {
                return false;
            }
            else {
                charMap.put(c, Boolean.valueOf(true));
            }
            prevChar = c;
        }
        return true;
    }
}