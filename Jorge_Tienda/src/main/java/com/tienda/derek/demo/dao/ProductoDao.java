/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.derek.demo.dao;

import com.tienda.derek.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author jorge
 */
public interface ProductoDao extends JpaRepository <Producto ,Long>{
    
}
