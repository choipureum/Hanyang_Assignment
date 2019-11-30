package github;

class Main {
	  public static void main(String[] args) {
	    Graduate student1 = new Graduate("홍길동",2010123456,"education",0.5);
	    System.out.println(student1.toString());
	    //이름: 홍길동,학번: 2010123456, 조교 유형: education, 장학금 비율: 0.5
	    
	  	student1.setScholarshipRate(0.5);
			student1.setTatype("research");
			System.out.println(student1.toString());
			Graduate student2 = new Graduate("홍길동",2010123456,"education",1);
			//이름: 홍길동,학번: 2010123456, 조교 유형: research, 장학금 비율: 0.5
			
			System.out.println(student2.equals(student1));
			//true
	  
	  }
	}