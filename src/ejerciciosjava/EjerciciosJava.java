//Ignacio Rodriguez Martin
package ejerciciosjava;

/**
 *
 * @author Ignacio
 */
public class EjerciciosJava {




 public  boolean  fiestaArdillas ( int  numeroBellotas , boolean  finDeSemana ) {

        //Si es fi de semana da igual cuantas bellotas tengan 
        if (finDeSemana) {
            return true;
        }
        if (numeroBellotas >= 40 && numeroBellotas <= 60) {
            return true;
        }
        return false;
    }
    /**
@param velocidad
@param birthday
@param
*/
    public int multa(int velocidad, boolean birthday) {
        if (birthday) {
            velocidad -= 5;
        }
        if (velocidad <= 60) {//si vale a menos de 60, no hay multa 

            return 0;
        }
        if (60 < velocidad && velocidad <= 80) {
            return 1;//multa pequeña
        }
        return 2;
    }
public boolean  muyvanidoso(int multiplo ){
if (multiplo %11==0){
return true;


}
if(multiplo %11==1){
return true;

}
return false;
}
public boolean SuenaTuMovil (boolean matinal,boolean madre,boolean dormido){

if(matinal==false && madre==false &&dormido==false){
return true;
}
if(matinal==false && madre==false &&dormido==true){
return false ;
}
if(matinal==true && madre==false &&dormido==false){
return false;
}
return false;
}    


    public static void main(String[] args) {

//test del primer ejercecio
        EjerciciosJava ejercicio = new EjerciciosJava();
        System.out.println("Ejercicio 01 :ARDILLAS");
      System.out.println("30, false: " + ejercicio.fiestaArdillas(30, false));
        System.out.println("50, false: " + ejercicio.fiestaArdillas(50, false));
       System.out.println("70, false: " + ejercicio.fiestaArdillas(70, true));

 //segundo ejercicio
        System.out.println("Ejercicio 02 :multa");
      System.out.println("60, false: " + ejercicio.multa(60, false));
        System.out.println("65, false: " + ejercicio.multa(65, false));
       System.out.println("65, true: " + ejercicio.multa(65, true));
//tercer ejercicio
 System.out.println("Ejercicio 03 :muyvanidoso");
      System.out.println("22, true: " + ejercicio.muyvanidoso(22));
        System.out.println("23, true: " + ejercicio.muyvanidoso(23));
       System.out.println("24 false: " + ejercicio.muyvanidoso(24));

 System.out.println("Ejercicio 04 :SuenaTuMovil");
      System.out.println("false,false,false " + ejercicio.SuenaTuMovil(false, false, false));
        System.out.println("false ,false,true: " +  ejercicio.SuenaTuMovil(false, false, true));
       System.out.println(" true,false,false: " +  ejercicio.SuenaTuMovil(true, false, false));
    }

}
