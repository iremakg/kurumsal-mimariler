package nLayeredDemo.DataAccess.Concretes;

import nLayeredDemo.DataAccess.Abstracts.ProductDao;
import nLayeredDemo.Entities.Concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("hibernate ile eklendi:" +product.getName());

    }

    @Override
    public void update(Product product) {
        System.out.println("");


    }

    @Override
    public void delete(Product product) {
        System.out.println("");


    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
