package org.application;

import org.model.dao.DaoFactory;
import org.model.dao.SellerDao;
import org.model.entities.Department;
import org.model.entities.Seller;

import java.util.Date;


public class Program {
    public static void main(String[] args) {

        Department dp = new Department("IT", 1);
        Seller sl = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0,dp);
        SellerDao sd = DaoFactory.createSellerDao();
        System.out.println(sl);


    }
}