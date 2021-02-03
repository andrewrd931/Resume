
/**
 * Write a description of class piggyBank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class piggyBank
{
    private double totalBalance;
    private double balance;
    public piggyBank(double tBalance2) {
        totalBalance = tBalance2;
        
    }
    public double getBalance() {
        return(totalBalance);
    }
    public double deposit(double deposit){
        totalBalance += deposit;
        return(totalBalance);
    }
    public double withdrawl(double withdrawl2) {
        totalBalance -= withdrawl2;
        return(totalBalance);
   }
}