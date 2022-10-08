package DataAccess.HibernateDao;

import DataAccess.CategoryDao;
import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("kategori hibernate veritabanına eklendi...");
    }

    @Override
    public Category[] getall() {
        return new Category[0];
    }
}
