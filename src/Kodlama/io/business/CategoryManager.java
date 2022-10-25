package Kodlama.io.business;

import java.util.List;

import Kodlama.io.core.Logging.ILogger;
import Kodlama.io.dataAccess.Abstract.ICategoryDao;
import Kodlama.io.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] logger;
	private List<Category> categories;
	
	public CategoryManager(ICategoryDao categoryDao,ILogger[] logger,List<Category> categories) {
		this.logger=logger;
		this.categoryDao=categoryDao;
		this.categories=categories;
	}
	
	public void add(Category category) throws Exception {
		for (Category categor : categories) {
			if(categor.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Girdiğiniz Kategori adında bir kategori mevcut. Lütfen farklı bir kategori giriniz");
			}
		}
		
		
		categoryDao.add(category);
		
		for(ILogger logger:logger) {
			logger.log(category.getCategoryName());
		}
		}
}