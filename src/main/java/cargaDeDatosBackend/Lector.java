/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatosBackend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Lector {

    private FileReader archivo;
    private BufferedReader lector;
    private ArrayList<Libro> biblio;

    public Lector() {
        this.biblio = new ArrayList<>();
    }

    public void leer() {
        try {
            //archivo = new FileReader("C:\\Users\\DAVID\\Desktop\\practica 1\\Practica1_IPC2PS24\\entrada\\pruebaa.txt");
            archivo = new FileReader("C:\\Users\\DAVID\\Desktop\\practica 1\\data.txt");
            lector = new BufferedReader(archivo);
            if (archivo.ready()) {
                String texto;
                String titulo = null;
                String autor = null;
                String codigo = null;
                String cantidad = null;
                int caso = 0;
                while ((texto = lector.readLine()) != null) {

                    /*if (texto.equals("TITULO:Romeo y Julieta")) {
                        String[] cadena = texto.split(":");
                        titulo = cadena[1].trim();
                    } else if (texto.equals("AUTOR:William Shakespeare")) {
                        String[] cadena = texto.split(":");
                        autor = cadena[1].trim();
                    } else if (texto.equals("CODIGO:023-ABC")) {
                        String[] cadena = texto.split(":");
                        codigo = cadena[1].trim();
                    } else if (texto.equals("CANTIDAD:14")) {
                        String[] cadena = texto.split(":");
                        cantidad = cadena[1].trim();
                    }
                    */
                    
                    switch (caso) {
                        case 0:
                            if(texto.equals("")){
                                break;
                            }
                            caso = 1;
                            break;
                        case 1:
                            String[] cadenaT = texto.split("TITULO:");
                            titulo = cadenaT[1].trim();
                            caso = 2; 
                            break;
                        case 2:
                            String[] cadenaA = texto.split("AUTOR:");
                            autor = cadenaA[1].trim();
                            caso = 3;
                            break;
                        case 3:
                            String[] cadenaC = texto.split("CODIGO:");
                            codigo = cadenaC[1].trim();
                            caso = 4;
                            break;
                        case 4:
                            String[] cadenaN = texto.split("CANTIDAD:");
                            cantidad = cadenaN[1].trim();
                            caso = 0;
                            Libro newLibro = new Libro(titulo, autor, codigo, cantidad);
                            System.out.println(newLibro);
                            biblio.add(newLibro);
                            break;
                        default:
                            throw new AssertionError();
                    }

                }
                
            } else {
                System.out.println("archivo no redy xD");
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }

    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.leer();
    }
}
