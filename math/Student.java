package math;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class Student {

	
		private int studentId; //�л� ��ȣ
		private String studentName; //�л� �̸�
		private int age; //�л� ����
		private int phoneNumber; //�л� ��ȣ
		private String gender; // �л� ����
		private Subject supClass; // ���������Ŭ����
		
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
