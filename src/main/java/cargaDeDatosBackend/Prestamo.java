/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatosBackend;

/**
 *
 * @author DAVID
 */
public class Prestamo {
    
    private String codigoLibro;
    private String carnet;
    private String fecha;

    public Prestamo(String codigoLibro, String carnet, String fecha) {
        this.codigoLibro = codigoLibro;
        this.carnet = carnet;
        this.fecha = fecha;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", carnet=" + carnet + ", fecha=" + fecha + '}';
    }
    
    
}
