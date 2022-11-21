//ALBERTO ALONSO LÓPEZ.
public class Main {
  //Asignamos valores en la configuración del Run como se solicita en el enunciado.
  public static void main(String[] args) {

    System.out.println("Estudiante "+args[0]+" :");//Muestra por pantalla el Array guardado en la posición [0]="Homer Simpson"
    System.out.println(veredicto(args[1],args[2]));//Muestra por pantalla el lo que hay guardado en las posiciones [1][2]
//Está linea llama a imprimir el return del metodo veredicto al cual le estamos pasando los valores deseados del String
  }

 private static String veredicto(String modulos, String horas){//Creamos el metodo veredicto de tipo String y creamos 2 variables
   if (modulos.equals(horas)) {
     return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
   }//Con los if comparamos los valores enviados desde la llamada al metodo y usamos el integer para comparar los números.
   if (Integer.valueOf(modulos) < Integer.valueOf(horas)){
     return "Poco tiempo de estudio. Debes dedicar más tiempo.";
   }
    return "Ideal. Trabajas los contenidos en casa.";
  }
}
