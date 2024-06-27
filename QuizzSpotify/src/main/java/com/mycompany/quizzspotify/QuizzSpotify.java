/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizzspotify;

/**
 *
 * @author jimec
 */
public class QuizzSpotify {

    public static void main(String[] args) {
        
        Cancion spotify = new Cancion();
        System.out.println("Id :" + spotify.getIdCancion());
        System.out.println("Nombre Cancion: " + spotify.getTitulo());
        System.out.println("Autor:"+spotify.getAutor());
        System.out.println("Duracion:"+spotify.getDuracion());
        System.out.println("Año Creacion:"+spotify.getAnioCreacion());
        
        spotify.setTitulo("Duvet");
        spotify.setAutor("Boa");
        
        System.out.println("Titulo modificado: " + spotify.getTitulo());
        System.out.println("Autor modificado: " + spotify.getAutor());
        
    }
   
}
