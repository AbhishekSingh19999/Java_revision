package com.files.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;




@Entity
@Table(name="DucatStudent")
public class Student {
   public byte[] getImage() {
		return image;
	}





	public void setImage(byte[] image) {
		this.image = image;
	}

@Id
   @GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="Roll_Number")
   private int rollno;
   @Column(name="Student_Name")
	private String name;
   @Column(name="Course")
	private String course;
	
   @Column(name="Student_image")
	@Lob
	private byte image[];	
	
	
	public Student(byte[] image) {
	super();
	this.image = image;
}





	public Student()
	{
		
	}
	
	
	
	
	
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	
	
	
	public Student(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
	}


	
	
	
	
	
}
