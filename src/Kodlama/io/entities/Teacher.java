package Kodlama.io.entities;

public class Teacher {
	
	int id;
	String teacherName;
	String teacherLastName;
	
	public Teacher(int id,String teacherName,String teacherLastName) {
		this.id=id;
		this.teacherName=teacherName;
		this.teacherLastName=teacherLastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
}
