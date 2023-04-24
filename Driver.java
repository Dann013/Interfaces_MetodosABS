
package Interface;

import HerenciaMultiple.AlumnoDeportistaArtista;


public class Driver {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area = "+ cuadrado.calcularArea());
        Circulo circulo =new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo= "+ circulo.calcularArea());
        AlumnoDeportistaArtista  ada =new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Bastet ball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
}
