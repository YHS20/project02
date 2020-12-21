package math;

import javax.security.auth.Subject;

public class Score {
	int studentId; //학번
	Subject supClass; //보충수업반
	int point; //점수
	
	public Score(int studentId, Subject supClass, int point) {
		this.studentId = studentId;
		this.supClass = supClass;
		this.point = point;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studnetId) {
		this.studentId = studnetId;
	}
	
	public Subject getSupClass() {
		return supClass;
		
	}
	
	public void setSubject(Subject supClass) {
		this.supClass =supClass;
		
	}
	public int getPoint() {
		return point;
	}
	
	
}
