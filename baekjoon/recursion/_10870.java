package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(fib(Integer.parseInt(br.readLine())));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        
        return fib(n-1) + fib(n-2);
    }
}