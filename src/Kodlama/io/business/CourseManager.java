package Kodlama.io.business;

import java.util.List;

import Kodlama.io.core.Logging.ILogger;
import Kodlama.io.dataAccess.Abstract.ICourseDao;
import Kodlama.io.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] logger;
	private List<Course> coursies;
	
	public CourseManager(ICourseDao courseDao,ILogger[] logger,List<Course> coursies) {
		this.logger=logger;
		this.courseDao=courseDao;
		this.coursies=coursies;
	}
	
	public void add(Course course) throws Exception {
		for (Course categor : coursies) {
			if(categor.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Girdiğiniz kurs adında bir kategori mevcut. Lütfen farklı bir kategori giriniz");
			}
		if(course.getPrice()<0) {
			throw new Exception("fiyat 0 dan küçük olamaz!!!!!"); 
		}
		
		
		courseDao.add(course);
		
		for(ILogger logger:logger) {
			logger.log(course.getCourseName());
		}
		}
	}
}