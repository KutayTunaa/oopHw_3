package Business;

import Core.Logging.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

import java.util.List;

public class CategoryManager {
    private Category[] categories;
    private Logger[] loggers;

    private CategoryDao categoryDao;

    //aynı zamanda List<Logger>loggers == Logger[] loggers olarakta yazabiliriz
    // ikiside array anlamı taşır

    public CategoryManager(List<Category> category, CategoryDao categoryDao , Logger[] loggers ) {
        this.categories = categories;
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    public void add(Category category)  throws Exception {
        for (Category categories : categoryDao.getall()) {
            if (category.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Aynı isminde bir kategori var, aynı isimle yeni kategori oluşturulamaz ! "
                        + category.getCategoryName());
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }




}

