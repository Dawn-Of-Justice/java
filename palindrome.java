//Java Program to check palindrome

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        int i=0;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome");
        str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean palindrome = true;
        while(i<(str.length()/2)){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                palindrome = false;
                break;
            }
            i++;
        }

        if(palindrome){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
