import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        char begin = '0';
        char end = '0';
        int fl = 0;
        for (int i = 0; i < A.length() / 2; i++){
            begin = A.charAt(i);
            end = A.charAt(A.length() - i - 1);
            if (begin != end) {
                fl = 1;
                break;
            }
        }
        if (fl == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}