import java.util.Scanner;

public class Game{
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Let`s play Rock, Paper Scissors");
    System.out.println("When I say 'shoot', Choose Rock, Paper or Scissor.");
    System.out.println("Are you ready? write 'yes' if you are ready");
 
    String answer=scan.nextLine();
    answer=answer.toLowerCase();
     
    if (answer.equals("yes")){
        System.out.println("Let`s play Rock, Paper Scissors");
        System.out.println("Great!");
        

        System.out.println("rock - paper - scissors, shoot!");
        String opcionJugador=scan.nextLine();
       
        System.out.println("You chose: "+opcionJugador+":"+convertirOpcionEntero(opcionJugador.toLowerCase()));
        int indice = rollDice();
        
       
        System.out.println("The computer chose: "+ obtenerOpcionComputador(indice).toLowerCase()+":"+indice);
        System.out.println("The winner is: "+definirGanador(indice,convertirOpcionEntero(opcionJugador.toLowerCase())));
    }
    else{
        System.out.println("Bye Rock, Paper Scissors");
    }

    scan.close();
   }

   public static String definirGanador(int computador, int jugador){
    String ganador="";
    if (computador == jugador)
     ganador="Computer and player even";
    else if((computador==2 && jugador==3) || (computador==1 && jugador==2) || (computador==3 && jugador==1))
        ganador="Player";
    else 
         ganador="Computer";
    return ganador;
   }


    public static int rollDice(){
    double randomNumber = Math.random()*3;
        randomNumber +=1;
        return (int) randomNumber;
    }

    public static int convertirOpcionEntero(String opcionJugador){
        int intConvertido=0;
          switch(opcionJugador){
            case "rock":
                intConvertido=3;
                break;
            case "paper":
                intConvertido=1;
                break;
            case "scissors":
                intConvertido=2;
                break;
        }
        return intConvertido;
    }

    public static String obtenerOpcionComputador(int indice){
     String opcionComputador="";
        switch(indice){
            case 3:
                opcionComputador="Rock";
                break;
            case 1:
                opcionComputador="Paper";
                break;
            case 2:
                opcionComputador="Scissors";
                break;
        }
        return opcionComputador;
    }
}