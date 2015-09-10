package edu.pccu;

public class Student {
	private int student_id = 0;
	private String student_name = null;
	private String student_tel = null;
	
	public int getStudent_id()
	{
		return student_id;
	}
	
	public void setStudent_id(int student_id)
	{
		this.student_id = student_id;
	}
	
	public String getStudent_name()
	{
		return student_name;
	}
	public void setStudent_name(String student_name)
	{
		this.student_name = student_name;
	}
	public String getStudent_tel()
	{
		return student_tel;
	}
	
	public void setStudent_tel(String student_tel)
	{
		this.student_tel = student_tel;
	}
}
