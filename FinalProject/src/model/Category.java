package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	   
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "CategoryId",nullable=false)
		private int CategoryId;
		@Column(name = "categoryName",nullable=false)
		private String categoryName;
		
		public Category() {
			
		}
		
		public Category(int categoryId, String categoryName) {
			super();
			CategoryId = categoryId;
			this.categoryName = categoryName;
		}

		
		public int getCategoryId() {
			return CategoryId;
		}

		public void setCategoryId(int categoryId) {
			CategoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		
}
