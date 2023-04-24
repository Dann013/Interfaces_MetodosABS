/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaMultiple;

/**
 *
 * @author Gateway
 */
public class Alumno extends Persona{
    private int numeroCuenta;
    private String carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(int edad) {
        super(edad);
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }
   
    public Alumno(int numeroCuenta, String carrera, double promedio) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", promedio=" + promedio + '}';
    }
    
    
}
