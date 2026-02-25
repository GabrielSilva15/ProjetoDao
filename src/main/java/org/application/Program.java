package org.application;

import org.db.DB;
import org.db.DbException;
import org.model.dao.DaoFactory;
import org.model.dao.SellerDao;
import org.model.entities.Department;
import org.model.entities.Seller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {


        SellerDao sd = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: seller find by id ===");
        Seller seller = sd.findById(1);
        System.out.println(seller);


        System.out.println("=== Test 2: seller find by department ===");
        Department department = new Department(null,1);
        List<Seller> list = sd.findByDepartment(department);
        for(Seller obj:list){
            System.out.println(obj);
        }

        System.out.println("=== Test 3: seller find all ===");
        list = sd.findAll();
        for(Seller obj:list){
            System.out.println(obj);
        }

    }
}