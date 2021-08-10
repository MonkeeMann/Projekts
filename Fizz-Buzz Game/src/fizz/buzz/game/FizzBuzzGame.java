/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizz.buzz.game;

/**
 *
 * @author mepig
 */
public class FizzBuzzGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int Number;
        Number = 1;
while (Number < 100) {
if (Number%3==0&&Number%5==0) {
System.out.println("Fizz-Buzz!");
}
else if (Number%3==0) {
System.out.println("Fizz!");
}
else if (Number%5==0) {
System.out.println("Buzz!");
}

else {
System.out.println(Number);      
}
Number = Number + 1;  
    }
    
}}
