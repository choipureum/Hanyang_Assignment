package mainproject;
import java.lang.*;
class Main {
  
	public static String len_check(String str) {
	  // fill here! 
		if(str==null) throw new RuntimeException("null");
		if(str.length()>20) throw new RuntimeException("More than 20 words");
		
		return str;
	}
	public static void main(String[] args) {

		//System.out.println(len_check("abcdefghijklmnopqrs"));//abcdefghijklmnopqrs
		//System.out.println(len_check("abcdefghijklmnopqrsuvw"));
		System.out.println(len_check(null));
	}
}

/*
문자열을 str 을 입력으로 받아서, str의 길이가 20을 초과할 경우 
문자열 "More than 20 words" 을 품은 RuntimeException 을 발생시키고 
str이 null 일 경우 문자열 "null"을 품은RuntimeException 을 발생시키며 
두 경우 다 해당되지 않을경우 받은 문자열을 그대로 돌려주는 len_check 함수를 작성하라. 
 */