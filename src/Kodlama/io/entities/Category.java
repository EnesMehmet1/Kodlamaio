package Kodlama.io.entities;

public class Category {
	
	 int id;
	 String CategoryName;
	 
	 public Category(int id,String CategoryName) {
		 this.id=id;
		 this.CategoryName=CategoryName;
	 }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
}
