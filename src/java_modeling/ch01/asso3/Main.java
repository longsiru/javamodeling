package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		//학생 두명 생성
		Student s1 = new Student("longsiru");
		Student s2 = new Student("longfan");
		
		//과목 생성
		Course jv = new Course("java");
		Course dp = new Course("Design Pattern");
		
		
		//수강 신청
		Transcript t1 = new Transcript(s1, jv); //longsiru는 java를 신청한다.
		Transcript t2 = new Transcript(s1, dp);
		Transcript t3 = new Transcript(s2, dp);
		
		t1.setDate("2022");
		t1.setGrade("B0");  //longsiru의 2022년 java성적이 B0다
		
		t2.setDate("2022");
		t2.setGrade("D+"); //longsiru의 2022년 Design Pattern성적이 D+다
		
		t3.setDate("2023");
		t3.setGrade("C+"); //longfan의 2023년 Design Pattern성적이 C+다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
