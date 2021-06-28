package exam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student extends Marks{
	private int rollNo;
	private String name;
	
	@Id
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int rollNo, String name, String course, int isa1, int isa2, int isa3, int endSem) {
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.isa1=isa1;
		this.isa2=isa2;
		this.isa3=isa3;
		this.endSem=endSem;
	}
	
	public void display(int rollNo, String name, String course, int endSem) {
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.endSem=endSem;
	}
}
