package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.core.JLoggerManagerAdapter;
import com.company.dataAcces.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;
import com.company.jLogger.JLoggerManager;

public class Main {
                //nLayeredDemo Project
    public static void main(String[] args) {

        //ToDo : Spring IoC ile çözülecek
        ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter() ); //ProductManager(new AbcProductDao()) ile de sistemi değiştirebilirsin
        Product product = new Product(1,1,"Elma",12,50);
        productService.add(product);
    }
}
