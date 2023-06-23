import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //str 을 char 배열로 만들 변수
        char[] strArray = str.toCharArray();
        //대소문자 변경한 char 을 넣을 String 객체
        String prnStr = "";
        
        //문자열 1 <= str <= 20
        if(strArray.length >= 1 && strArray.length <= 20){
            for(char charStr : strArray){
                //대문자인지 판단
                if(Character.isUpperCase(charStr)){
                    //대문자일 경우 소문자로변환
                    charStr = Character.toLowerCase(charStr);
                }else {
                    //대문자로 변환
                    charStr = Character.toUpperCase(charStr);
                }
                //변경한 문자열 print 할 객체에 저장
                prnStr += charStr;
            }
        }
        
        
        
        System.out.println(prnStr);
        
        
    }
}

//다른 풀이 아스키코드 활용
/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";
        for (int i=0; i<a.length(); i++) {
            char index = a.charAt(i);

            if (index >= 65 && index <= 90) {
                answer += String.valueOf(index).toLowerCase();
            } else {
                answer += String.valueOf(index).toUpperCase();
            }
        }

        System.out.println(answer);
    }
}
*/