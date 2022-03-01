import nLayeredDemo.Business.Abstracts.ProductService;
import nLayeredDemo.Business.Concretes.ProductManager;
import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.DataAccess.Concretes.AbcProductDao;
import nLayeredDemo.Entities.Concretes.Product;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product = new Product(1,"elma",2, 12,50);
        productService.add(product);
    }
}
