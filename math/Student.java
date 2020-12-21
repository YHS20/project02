package math;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class Student {

	
		private int studentId; //학생 번호
		private String studentName; //학생 이름
		private int age; //학생 나이
		private int phoneNumber; //학생 번호
		private String gender; // 학생 성별
		private Subject supClass; // 보충수업반클래스
		
		private ArrayList<Score> scoreList = new ArrayList<Score>();
		
		public Student(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
			
		}
		
		public void addSubjectScore(Score score) {
			score.List.add(score);
		}
		
		public int getStudentId() {
			return studentId;
		}
		
		public String getStudentName() {
			return studentName;
		}
		
		public int getage() {
			return age;
		}
		
		public int getphoneNumber() {
			return phoneNumber;
		}
		
		public String gender() {
			return gender();
						
		}
		public Subject supClass() {
			return supClass();
		}
		
		
		
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		
		public ArrayList<Score> getScoreList(){
			return scoreList;
		}
		
		public void setScoreList(ArrayList<Score> scoreList) {
			this.scoreList = scoreList;
			
		}



}
