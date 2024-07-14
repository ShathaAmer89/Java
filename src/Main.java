<<<<<<< HEAD
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       Double result;
       String inntall1=JOptionPane.showInputDialog("skriv in tall1");
       String inntall2=JOptionPane.showInputDialog("skriv in tall2");
       String regntegn=JOptionPane.showInputDialog("+,-,/,*");
       Double tall1=Double.parseDouble(inntall1);
       Double tall2=Double.parseDouble(inntall2);
       switch(regntegn){
           case "+":
               result= tall1+tall2;
               break;
           case "-":
               result= tall1-tall2;
               break;
           case "/":
               result= tall1/tall2;
               break;
           case"*":
               result= tall1*tall2;
               break;


           default:
               throw new IllegalStateException("Unexpected value: " + regntegn);
       }
       JOptionPane.showMessageDialog(null, result);
       
=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> origin/master
    }
}