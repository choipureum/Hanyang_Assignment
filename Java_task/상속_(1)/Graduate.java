package github;


public class Graduate extends Student{
	private String tatype;	        //조교 유형
	private double scholarshipRate; //장학금 비율 
	
	//대학원생의 이름, 학번 조교 유형, 장학금 비율
	// 각각 주어진 값으로 초기화 하면서 객체를 생성
	public Graduate(String Name, int Number,String Tatype,double ScholarshipRate) {
		super(Name,Number);
		this.name=Name;
		this.number=Number;
		this.tatype=Tatype;
		this.scholarshipRate=ScholarshipRate;
		
		

	}
	//조교 유형 변경
	public void setTatype(String newTatype) {
		tatype=newTatype;
	}
	//장학금 비율 변경
	public void setScholarshipRate(double newScholarshipRate) {
		scholarshipRate=newScholarshipRate;
	}
		// 조교 유형을 반환한다
	public String getTatype() {
    return tatype;
	}
	
	//장학금 비율을 반환한다
	public double getScholarshipRate() {
    return scholarshipRate;
	}	
		// 대학원생의 모든 데이터를 반환한다.
	public String toString() {
		return "이름: "+name+","+"학번: "+number+"조교 유형: "+tatype+","+ "장학금 비율: "+scholarshipRate;
	}
}
