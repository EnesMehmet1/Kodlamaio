package Kodlama.io.business;

import Kodlama.io.core.Logging.ILogger;
import Kodlama.io.dataAccess.Abstract.ITeacherDao;
import Kodlama.io.entities.Teacher;

public class TeacherManager {
	private ITeacherDao teacherDao;
	private ILogger[] logger;
	
	
	public TeacherManager(ITeacherDao teacherDao,ILogger[] logger) {
		this.logger=logger;
		this.teacherDao=teacherDao;
	}
	
	public void add(Teacher teacher) throws Exception {
		if(teacher.getId()<10) {
			throw new Exception("fiyat 10'dan küçük olamaz"); 
		}
		
		
		teacherDao.add(teacher);
		
		for(ILogger logger:logger) {
			logger.log(teacher.getTeacherName());
		}
		}
}