package org.model.dao;

import org.db.DB;
import org.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {


    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
