import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        //문자열 길이
        int strNum = str.length();
        if(strNum >= 1 && strNum <= 10 && n >= 1 && n <= 5){
            for(int i=0; i < n; i++){
                System.out.print(str);
            }
        }
		/*
		while(--n == 0)
		이런 방법 있음, 신박했음
		*/
    }
}