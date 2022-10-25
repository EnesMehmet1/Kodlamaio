package Kodlama.io;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.business.CategoryManager;
import Kodlama.io.business.CourseManager;
import Kodlama.io.business.TeacherManager;
import Kodlama.io.core.Logging.ILogger;
import Kodlama.io.core.Logging.databaseLogger;
import Kodlama.io.core.Logging.fileLogger;
import Kodlama.io.core.Logging.mailLogger;
import Kodlama.io.dataAccess.concrate.HibernateCategoryDao;
import Kodlama.io.dataAccess.concrate.HibernateCourseDao;
import Kodlama.io.dataAccess.concrate.jdbcTeacherDao;
import Kodlama.io.entities.Category;
import Kodlama.io.entities.Course;
import Kodlama.io.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Category> categories=new ArrayList<>(); 
		Category category=new Category(100,"Mehmet");	
		ILogger[] loggers= {new databaseLogger(),new fileLogger(),new mailLogger()};
		CategoryManager cm=new CategoryManager(new HibernateCategoryDao(), loggers,categories);
		cm.add(category);
		
		List<Course> coursies=new ArrayList<>(); 
		Course course=new Course(100,"Mehmet",-1);	
		ILogger[] loggers1= {new databaseLogger(),new fileLogger(),new mailLogger()};
		CourseManager cm1=new CourseManager(new HibernateCourseDao(), loggers1, coursies);
		cm1.add(course);
		
		
		Teacher teacher=new Teacher(100,"Mehmet","Yıldırım");
		ILogger[] loggers2= {new databaseLogger(),new fileLogger(),new mailLogger()};
		TeacherManager cm2=new TeacherManager(new jdbcTeacherDao(), loggers2);
		cm2.add(teacher);
	}

}
