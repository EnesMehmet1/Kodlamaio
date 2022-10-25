package Kodlama.io.dataAccess.Abstract;

import Kodlama.io.entities.Category;

public interface ICategoryDao {
	void add(Category Category);
	void delete(Category Category);
	void update(Category Category);
}
