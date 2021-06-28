package exam;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table (name = "Exam Marks")
public class Marks {
	protected String course;
	protected int isa1;
	protected int isa2;
	protected int isa3;
	protected int endSem;
	
	public int getIsa1() {
		return isa1;
	}
	public void setIsa1(int isa1) {
		this.isa1 = isa1;
	}
	public int getIsa2() {
		return isa2;
	}
	public void setIsa2(int isa2) {
		this.isa2 = isa2;
	}
	public int getIsa3() {
		return isa3;
	}
	public void setIsa3(int isa3) {
		this.isa3 = isa3;
	}
	public int getEndSem() {
		return endSem;
	}
	public void setEndSem(int endSem) {
		this.endSem = endSem;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
