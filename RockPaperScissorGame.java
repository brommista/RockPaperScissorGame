import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame
 {
     
     public static void welcome()
     {
        System.out.println("Welcome to Rock Paper Scissor game! Please enter your name to proceed:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", you will be playing against computer. Winner will be decided after 5 rounds.");
     }
    public static String generateRan()
    { 
        Random rand = new Random();
        String[] a = {"rock", "paper", "scissor"};
        int b = rand.nextInt(a.length);
        String randChoice = a[b];
        return randChoice;
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        welcome();
   
        int count = 1;
        int tie = 0;
        int win = 0;
        int loss = 0;

        while(count<6)
        {
          System.out.println("Please enter your choice from Rock/paper/Scissor to play Round " + count);

          String response = sc.nextLine();
          String responseLower = response.toLowerCase();

          String computer = generateRan();
        

          if(responseLower.equals(computer))
          {
              System.out.println("Computer picks " + computer +". Round "+ count+ " is tie");
            tie ++;
          }

          else if ((responseLower.equals("rock") && computer.equals("paper")) || (responseLower.equals("paper") && computer.equals("scissor")))
          {
                System.out.println("Computer picks " + computer + ". You lost Round "+ count);  
                loss++;        
          }

          else if((responseLower.equals("rock") && computer.equals("scissor")) || (responseLower.equals("paper") && computer.equals("rock")))
          {
                System.out.println("Computer picks " + computer + ". You won Round "+ count);
                win++;
          }

        else if(responseLower.equals("Scissor") && computer.equals("paper"))
          {
                System.out.println("Computer picks " + computer + ". You won Round "+ count);
                win++;
          }

          else if(responseLower.equals("scissor") && computer.equals("rock"))
          {
                System.out.println("Computer picks " + computer + ". You lost Round "+ count);
                loss++;
          }
          else{
              System.out.println("Your response was invalid. Round "+ count + " is not considered");
          }

          System.out.println("Result after "+ "Round "+ count + " is tie: " + tie + " win: " + win + " loss: "+ loss);    
          count++;
        }

        if (win > loss)
        {
            System.out.println("Congratulations! you won the game.");
        }
        else if (loss> win)
        {
            System.out.println("You lost. Better luck next time!");
        }
        else
        {
            System.out.println("Game has tied.");
        }   
          
        
    }   

    
}


