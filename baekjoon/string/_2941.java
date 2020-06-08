package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 미제출
public class _2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int count = 0;
        String s = br.readLine();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.length() == 0) {
                switch(c) {
                    case 'c':
                    case 'd':
                    case 'l':
                    case 'n':
                    case 's':
                    case 'z':
                        if (i == s.length()-1) {
                            count += 1;
                        }
                        else {
                            sb.append(c);
                        }                        
                        break;
                    default:
                        count += 1;
                        break;
                }
            }
            else if (sb.length() == 1) {
                switch(c) {
                    case 'c':
                    case 'd':
                    case 'l':
                    case 'n':
                    case 's':
                        if (i == s.length()-1) {
                            count += 2;
                        }
                        else {
                            count += 1;
                            sb.setLength(0);
                            sb.append(c);
                        }
                        
                        break;
                    case '=':
                        if (sb.charAt(0) == 'c' || 
                            sb.charAt(0) == 's' || 
                            sb.charAt(0) == 'z') {
                            count += 1;
                            sb.setLength(0);
                        }
                        else {
                            count += 2;
                            sb.setLength(0);
                        }
                        break;
                    case '-':
                        if (sb.charAt(0) == 'c' || 
                            sb.charAt(0) == 'd') {
                            count += 1;
                            sb.setLength(0);
                        }
                        else {
                            count += 2;
                            sb.setLength(0);
                        }
                        break;
                    case 'j':
                        if (sb.charAt(0) == 'l' || 
                            sb.charAt(0) == 'n') {
                            count += 1;
                            sb.setLength(0);
                        }
                        else {
                            count += 2;
                            sb.setLength(0);
                        }
                        break;
                    case 'z':
                        if (sb.charAt(0) == 'd') {
                            if (i == s.length()-1) {
                                count += 2;
                            }
                            else {
                                sb.append(c);
                            }                            
                        }
                        else {
                            if (i == s.length()-1) {
                                count += 2;
                            }
                            else {
                                count += 1;
                                sb.setLength(0);
                                sb.append(c);
                            }                            
                        }
                        break;
                    default:
                        count += 2;
                        sb.setLength(0);
                        break;
                }
            }
            else if (sb.length() == 2) {
                switch(c) {
                    case '=':
                        if (sb.charAt(0) == 'd' && 
                            sb.charAt(1) == 'z') {
                                count += 1;
                                sb.setLength(0);
                        }
                        else {
                            count += 3;
                            sb.setLength(0);
                        }
                        break;
                    case 'c':
                    case 'd':
                    case 'l':
                    case 'n':
                    case 's':
                    case 'z':
                        if (i == s.length()-1) {
                            count += 3;
                        }
                        else {
                            count += 2;
                            sb.setLength(0);
                            sb.append(c);
                            break;
                        }                        
                    default:
                        count += 3;
                        sb.setLength(0);
                        break;
                }
            }
        }
        System.out.println(count);
    }
}
