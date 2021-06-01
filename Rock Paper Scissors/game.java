
import javax.swing.*;




public class game {
public static void main(String [] args){


   

   while(true){

    
    String response = JOptionPane.showInputDialog(null, "Welcome to rock paper scissors! Please choose 'rock, paper or scissors', and the ai will do the same.", JOptionPane.PLAIN_MESSAGE);   
        int computerPick = (int)(Math.random()*3);

        String opponentMove = "";
        if (computerPick == 0){
            opponentMove = "rock";
        } else if (computerPick == 1){
            opponentMove = "paper";
        } else if (computerPick == 2) {
            opponentMove = "scissors";
        }

    if(response.equalsIgnoreCase("rock")){


        System.out.println("Opponent move: " + opponentMove);

        if (computerPick == 0){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Rock vs Rock! Tie!");

        } else if (computerPick == 1){
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Rock vs Paper! You lost!");
        } else {
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Rock vs Scissors! You won!");
        }
   } else if(response.equalsIgnoreCase("paper")){
    if (computerPick == 0){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Paper vs Rock! You won!");

    } else if (computerPick == 1){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Paper vs Paper! Tie!");
    } else {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Paper vs Scissors! You lost!");
    }
   } else if(response.equalsIgnoreCase("scissors")){
    if (computerPick == 0){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Scissors vs Rock! You lost!");

    } else if (computerPick == 1){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Scissors vs Paper! You won!");
    } else {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Scissors vs Scissors! Tie!");
    }
   } else {
    JFrame f;
    f = new JFrame();
    JOptionPane.showMessageDialog(f, "Please type in rock, paper or scissors.");
   }
   System.exit(1);

}
}
}
