import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long n = (long)Math.pow(a,b);
        int x = 0;
        while (n > 0 || x > 9)
        {
            if (n == 0)
            {
                n = x;
                x = 0;
            }
            x += n % 10;
            n /= 10;
        }
        System.out.println(x);
    }
}