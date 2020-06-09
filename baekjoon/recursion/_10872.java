package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10872 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(--num);
    }
}