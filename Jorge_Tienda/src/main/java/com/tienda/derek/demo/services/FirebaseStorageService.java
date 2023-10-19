/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.derek.demo.services;

/**
 *
 * @author jorge
 */
import org.springframework.web.multipart.MultipartFile;
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-jordi.appspot.com";
    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-jordi-firebase-adminsdk-gksts-de5d1d732c.json";
}
