/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pig.the.game;
import java.util.*;

/**
 *
 * @author mepig
 */
public class PigTheGame {

    /**
     * @param args the command line arguments
     */
    
    public static int rollDice() 
    {
        Random rand = new Random();
        int number = rand.nextInt(6)+1;
        return number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1score = 0; int p2score = 0; int tempscore1 = 0; int tempscore2 = 0; int turn = 1;
        int dice = 0; int move;
        boolean turnover = false;
        boolean gameover = false;
System.out.println("Welcome to pig! I assume you know how to play."); //game instructions
        


while (gameover == false) {
            if (p1score == 100) {
                System.out.println("Player 1 takes the win!");
                gameover = true;
            }
            else if (p2score == 100) {
                System.out.println("Player 2 takes the win!");
                gameover = true;
            }
            
            
            if (turn == 1) {
                dice = rollDice();
                tempscore1 += dice;
                
                if (dice == 1) {
                    tempscore1 = 0;
                    System.out.println("You rolled a 1. What a noob. Your temporary score is now reset.");
                    turn = 2;
                    continue;
                }
                
                System.out.println("Player 1 you rolled a " + dice + ". Your temporary score is " + tempscore1 + ". Would you like to roll or hold?");
                move = input.nextInt();
                if (move == 1) {
                    continue;
                }
                else if (move == 2) {
                    p1score += tempscore1;
                    System.out.println("You have chosen to hold. Your score is now " + p1score + ". You gained " + tempscore1 + " points.");
                    tempscore1 = 0;
                    turn = 2;
                    continue;
                }
            }
            
            
            
            
            else if (turn == 2) {
                dice = rollDice();
                tempscore1 += dice;
                if (dice == 1) {
                    tempscore2 = 0;
                    System.out.println("You rolled a 1. Such a non. Your temporary score is now reset.");
                    turn = 1;
                    continue;
                }
                System.out.println("Player 2 you rolled a " + dice + ". Your temporary score is " + tempscore2 + ". Would you like to roll or hold?");
                move = input.nextInt();
                if (move == 1) {
                    continue;
                }
                else if (move == 2) {
                    p1score += tempscore1;
                    System.out.println("You have chosen to hold. Your score is now " + p2score + ". You gained " + tempscore2 + " points.");
                    tempscore2 = 0;
                    turn = 1;
                    continue;
                }
            }
            
        }
    }
    
}
