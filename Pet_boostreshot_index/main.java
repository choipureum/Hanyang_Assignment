package Pet_boostreshot_index;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shotAnswer;	// 예방주사 접종여부 입력 값
		String dogName; 	  // 개 이름
		int dogAge; 	  	  // 개 나이
		String dogBreed; 	  // 개 품종
		boolean dogShot; 	  // 예방주사 접종여부
		

		Dog Dog1 = new Dog();
		System.out.println(Dog1.toString());
		//이름: , 나이: 0, 품종: , 접종여부: false
		
		Dog1.setName("haru");
		Dog1.setAge(3);
		Dog1.setBreed("Jindo");
		Dog1.setboostreShot();
		System.out.println(Dog1.toString());
		//이름: haru, 나이: 3, 품종: Jindo, 접종여부: true
		
		Dog Dog2 = new Dog("dangdang",4,"poodle");
		System.out.println(Dog2.toString());
		//이름: dangdang, 나이: 4, 품종: poodle, 접종여부: false
		
	}

}
