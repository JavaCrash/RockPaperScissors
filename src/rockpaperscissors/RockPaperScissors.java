/*
	Program:	RockPaperScissors.java
	Date:		10/18/2017
	Author:		Braden England && Jacarla Anderson
	Purpose:	To play Rock Paper Scissors
	Notes:		N/A	
	Change Log:	BE: N/A |
*/
package rockpaperscissors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Math; 

public class RockPaperScissors extends JFrame{

    public RockPaperScissors(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) {
        RockPaperScissors guiWindow = new RockPaperScissors();
        Integer PlayerWins, ComputerWins, Tie, ComputerChoice;
        //(int)(Math.random() * 3) + 1; was taken from https://stackoverflow.com/questions/7922978/random-numbers-with-math-random-in-java
        //System.out.println((int)(Math.random() * 3) + 1);
       
        Tie = 0;
        PlayerWins = 0;
        ComputerWins = 0;        
        //Initilize all the variables
        
        ComputerChoice = (int)(Math.random() * 3) + 1;
        //Choose a random digit between 1 and 3.
        System.out.println(ComputerChoice);
       
       
       String Choice="Y";
      while (Choice.equalsIgnoreCase("Y")) { 
       String UserChoice = JOptionPane.showInputDialog("Enter 1 for Rock, 2 for Paper, and 3 for Scissors");
       if (UserChoice.equals("1")){
           
           if (ComputerChoice.equals(1)){
                JOptionPane.showMessageDialog(null,
                "You chose: Rock, and The computer chose: Rock" + " It was a Draw!" );
                Tie++;
           }
           if (ComputerChoice.equals(2)){
                JOptionPane.showMessageDialog(null,
                "You chose: Rock, and The computer chose: Paper" + " Computer Wins!" );
                ComputerWins++;
           
           }
           if (ComputerChoice.equals(3)){
                JOptionPane.showMessageDialog(null,
                "You chose: Rock, and The computer chose: Scissors" + " You Win!" );
                PlayerWins++;
           
           }
            
       } else if (UserChoice.equals("2")){
            if (ComputerChoice.equals(1)){
                JOptionPane.showMessageDialog(null,
                "You chose: Paper, and The computer chose: Rock" + " You win!" );
                PlayerWins++;
           }
           if (ComputerChoice.equals(2)){
                JOptionPane.showMessageDialog(null,
                "You chose: Paper, and The computer chose: Paper" + " It was a Draw!" );
                Tie++;
           
           }
           if (ComputerChoice.equals(3)){
                JOptionPane.showMessageDialog(null,
                "You chose: Paper, and The computer chose: Scissors" + " Computer Wins!" );
                ComputerWins++;
           
           }
       } else if (UserChoice.equals("3")){
            if (ComputerChoice.equals(1)){
                JOptionPane.showMessageDialog(null,
                "You chose: Scissors, and The computer chose: Rock" + " Computer Wins!" );
                ComputerWins++;
           }
           if (ComputerChoice.equals(2)){
                JOptionPane.showMessageDialog(null,
                "You chose: Scissors, and The computer chose: Paper" + " You Win!" );
                PlayerWins++;
           
           }
           if (ComputerChoice.equals(3)){
                JOptionPane.showMessageDialog(null,
                "You chose: Scissors, and The computer chose: Scissors" + " It was a Draw!" );
                Tie++;
           
           }
       } else {
           JOptionPane.showMessageDialog(null,
                "Error: I do not recognize anything other than 1 2 or 3");
       }
	Choice = JOptionPane.showInputDialog("Enter Y if you would like to play again");
      }
      JOptionPane.showMessageDialog(null,"Here are the results. There were " + Tie + " ties and " + PlayerWins + " wins. The computer won " + ComputerWins + " times." );
    }
    }
