public class BankAccount
{
 private int accNumber;
 private double balance;
 
 public BankAccount(int accNumber)
 {
  this.accNumber = accNumber;
  balance=0;
 }

 public double getBalance()
 {
  return balance;
 }
 
 public void setBalance(double newBalance)
 {
   balance = newBalance;
 }





}