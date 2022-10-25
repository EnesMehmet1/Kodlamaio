package Kodlama.io.dataAccess.Abstract;

import Kodlama.io.entities.Teacher;

public interface ITeacherDao {
	void add(Teacher teacher);
	void delete(Teacher teacher);
	void update(Teacher teacher);
}
