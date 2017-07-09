package Fixtures;
import entities.*;
import controllers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;

import application.Main;
import application.SchoolClient;
import controllers.OpenCourseController;
import fit.ActionFixture;


public class DefineNewCourse extends ActionFixture{

	OpenCourseController NewCourse;
	private SchoolClient client1;
	private Course course;
	private String CourseID;
	private String CourseName;
	private String CourseSU;
	private String CourseWSH;
	
	public void startCourse() 
	{
		NewCourse = new OpenCourseController();
		try 
		{
			client1 = new SchoolClient("localhost", 5555);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}	
	
		
	public String courseName()
	{
		return CourseName;
	}
	

	

}
