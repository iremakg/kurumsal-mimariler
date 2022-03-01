package nLayeredDemo.Business.Concretes;

import nLayeredDemo.Business.Abstracts.ProductService;
import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.DataAccess.Abstracts.ProductDao;
import nLayeredDemo.Entities.Concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {





    private ProductDao productDao;

    public ProductManager(ProductDao productDao, JLoggerManagerAdapter jLoggerManagerAdapter) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
