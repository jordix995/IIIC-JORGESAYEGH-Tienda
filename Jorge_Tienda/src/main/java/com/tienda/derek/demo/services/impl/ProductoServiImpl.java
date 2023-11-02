/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.derek.demo.services.impl;
import com.tienda.derek.demo.dao.ProductoDao;
import com.tienda.derek.demo.domain.Categoria;
import com.tienda.derek.demo.domain.Producto;
import com.tienda.derek.demo.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiImpl implements ProductoService {

     @Autowired
    private ProductoDao ProductoDao;
     @Override
    @Transactional(readOnly = true)
    public List<Producto> getProducto(boolean activos) {
        var lista = ProductoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return ProductoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        ProductoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        ProductoDao.delete(producto);
    }
    
}