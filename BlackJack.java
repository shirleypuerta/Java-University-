import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
    
    System.out.println("Let`s play BlackJack");
    System.out.println("Are you ready? write 'yes' if you are ready");
 
    String answer=scan.nextLine();
    answer=answer.toLowerCase();
     
    if (answer.equals("yes") || answer.equals("y") ){
 
        System.out.println("Great!");
        int playerCard1=generateRandomCards();
          printCard(playerCard1);
        int playerCard2=generateRandomCards();
          printCard(playerCard2);
        int totalPlayer=playerCard1+playerCard2;
        System.out.println("The Player hand value is: "+totalPlayer);
         System.out.println("Press any key to continue");
 
        String continuar=scan.nextLine();
        int dealerCard1=generateRandomCards();
         printCard(dealerCard1);
        int dealerCard2=generateRandomCards();
         printCoverCard();
          int totalDealer=dealerCard1+dealerCard2;
         // System.out.println("The dealer hand value is: "+totalDealer);
    }
    else{
        System.out.println("Bye BlackJack!!");
    }

    scan.close();
    
}

    private static int generateRandomCards() {
        int cardNumber=rollDice();
      
        return cardNumber;
    }

    public static int rollDice(){
        double randomNumber = Math.random()*13;
            randomNumber +=1;
            return (int) randomNumber;
        }

    public static void printCard(int card){
                    System.out.println("┌─────┐");
        switch(card){
            case 1:
            System.out.println("│   A │");
            break;
            case 2:
            System.out.println("│   2 │");
            break;
            case 3:
            System.out.println("│   3 │");
            break;
            case 4:
            System.out.println("│   4 │");
            break;
            case 5:
            System.out.println("│   5 │");
            break;
            case 6:
            System.out.println("│   6 │");
            break;
            case 7:
            System.out.println("│   7 │");
            break;
            case 8:
            System.out.println("│   8 │");
            break;
            case 9:
            System.out.println("│   9 │");
            break;
            case 10:
            System.out.println("│   10│");
            break;
            case 11:
            System.out.println("│   J │");
            break;
            case 12:
            System.out.println("│   Q │");
            break;
            case 13:
            System.out.println("│   K │");
            break;
            default:                         
        }
            System.out.println("│     │");
            System.out.println("│   ♠ │");
            System.out.println("└─────┘");
    }

        public static void printCoverCard(){
            System.out.println("┌─────┐");
            System.out.println("│     │");
            System.out.println("│     │");
            System.out.println("│   ♠ │");
            System.out.println("└─────┘");
    }
}