package Kodlama.io.dataAccess.Abstract;

import Kodlama.io.entities.Course;

public interface ICourseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
}
