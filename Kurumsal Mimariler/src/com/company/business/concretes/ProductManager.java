package com.company.business.concretes;

import com.company.business.abstracts.ProductService;
import com.company.core.LoggerService;
import com.company.dataAcces.abstracts.ProductDao;
import com.company.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;  //dependency injection
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao,LoggerService loggerService){
        super();
        this.productDao=productDao;
        this.loggerService=loggerService;
    }



    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return; //aşağıyı görmez
        }
       // HibernateProductDao dao = new HibernateProductDao();
        // dao.add(product);              BU DİREK BAĞLILIK.HATALI OLUR. DEPENDENCY INJECTION YAPMALIYIZ

        this.productDao.add(product);//hiçbir şekilde hibernate bağlılığın yok esnek bir yapı
        this.loggerService.logToSystem("ÜRÜN EKLENDİ");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
