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


public class Program {
    public static void main(String[] args) {


        SellerDao sd = DaoFactory.createSellerDao();
        Seller seller = sd.findById(1);
        System.out.println(seller);



    }
}