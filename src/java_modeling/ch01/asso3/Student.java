package java_modeling.ch01.asso3;

import java.util.Vector;

public class Student {
	private String name;
	//Vector:ArrayList와 비슷하게 배열에 저장을 할수 있다.
	//course는 1..*
	private Vector<Transcript> transcripts;  //성적 리스트
	
	
	
	//생성자
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	
	//수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
