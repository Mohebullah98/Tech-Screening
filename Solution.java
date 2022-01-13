import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int addNumbers(int a, int b) {
        return a+b;
    }
    //String Compression
    public static String countChars(String s){
        int count =1;
        char current= s.charAt(0);
        String result ="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==current) count++;
            else{
                result +=current;
                result+=count;
                result+="-";
                current=s.charAt(i);
                count=1;
            }
            if(s.charAt(i)==current && i==s.length()-1){
                result+=current;
                result+=count;
            }
        }
        return result;
    }
    //Anagram comparison
    public static boolean compare(String a, String b){
        ArrayList <Character> List = new ArrayList<Character>();
        for(int i=0;i<a.length();i++){
            List.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++){
            char c = b.charAt(i);
            if(List.contains(c)){
                List.remove(new Character(c));
            }
            else return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = addNumbers(num1, num2);
        System.out.println("The sum is " + sum);
        String example = "aaabcccdeeee";
        System.out.println(countChars(example));
        String a = "rescue";
        String b = "secure";
        System.out.println(compare(a, b));
    }
}
