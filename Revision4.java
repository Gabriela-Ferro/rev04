package com.generation;
import java.util.Scanner;
/* Este codigo es un juego de piedra, papel y tijera, para ello se utiliza Scanner con el fin de que 
el usurario introduzca la informavon, a partir de ello el codigo compara lo que se introdujo en la 
consola. 
Se tienen casos en el que gana el jugador 1 como ganador, 
en caso de que no sea asi seria el jugador 2 quien gane
cambie el nombre de las variables a unas mas legibles incluyendo scanner, y tambien lo importe 
**/
public class Revision4{

public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String jugador1 = sc.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String jugador2 = sc.nextLine();
    if ( jugador1.equals(jugador2)){
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch(jugador1) {
        case "piedra":
          if (jugador2.equals("tijeras") ) {
            ganador = 1;
          } break;
        case "papel":
          if (jugador2.equals("piedra")) {
            ganador = 1;}
            break;
        case "tijera":
          if (jugador2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + ganador);
    }
  }
}