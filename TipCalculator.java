/* Mohammed Qutu
   1/27/2024
   21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
   Calculate Tip Amount
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TipCalculator 
{
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner (System.in);
        System.out.print(" Enter the total bill: ");
        double bill = keyBoard.nextDouble();
        System.out.print(" Enter the tip percentage as decimal: ");
        double percentage = keyBoard.nextDouble();
        double tipAmount = bill * percentage;
        double percentageConverted = percentage * 100;
        System.out.print("Bill amount: " + bill + "\nTip percentage: " +
                percentageConverted + "%" + "\nTip Amount: " + tipAmount);
        
    }
}
