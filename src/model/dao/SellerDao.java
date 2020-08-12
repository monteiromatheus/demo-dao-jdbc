/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entities.Seller;

/**
 *
 * @author Matheus
 */
public interface SellerDao {
    
    void insert(Seller obj);
    void update(Seller obj);
    void DeleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
