package kodlamaioNLayeredApp.business;

import kodlamaioNLayeredApp.entities.Category;
import java.util.ArrayList;

public class CategoryManager {
    private String category;
    private ArrayList<Category> categories;

    public CategoryManager(ArrayList<Category> categories) {
        this.categories = categories;
    }


    public void addCategory(Category category) throws Exception {

        for (Category cat : categories) {

            if (cat.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Category name can not be same!");
            }
        }
        categories.add(category);
    }
}
