//Ignacio Rodriguez Martin
package ejerciciosjava;

/**
 *
 * @author Ignacio
 */
public class EjerciciosJava {

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {
//Si es fi de semana da igual cuantas bellotas tengan 
        if (finDeSemana) {
            return true;
        }
        if (numeroBellotas >= 40 && numeroBellotas <= 60) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
System.out.println("Ejercicio 01 :ARDILLAS");
        System.out.println("30, false: "+ ejercicio.fiestaArdillas(30, false));
        System.out.println("50, false: "+ejercicio.fiestaArdillas(50, false));
        System.out.println("70, false: "+ejercicio.fiestaArdillas(70, true));
    }

}
