
package funciones2;

public class claseCoche {

    public static void main(String[] args) {
      Coche miCoche = new Coche();
      miCoche.AumentarPuertas();
      System.out.println("El total de puertas es de " + miCoche.puertas);
    }
  }


  class Coche {
    public int puertas = 4;
    public void AumentarPuertas(){
      puertas = puertas + 1;
    };
  }
