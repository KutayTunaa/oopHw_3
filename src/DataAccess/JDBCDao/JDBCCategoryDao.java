package DataAccess.JDBCDao;

import DataAccess.CategoryDao;
import Entities.Category;

public class JDBCCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("kategori JDBC veritabanına eklnedi... " + category.getCategoryName());
    }

    @Override
    public Category[] getall() {
        return new Category[0];
    }
}
