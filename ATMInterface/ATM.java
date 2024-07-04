import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.math.*;
import java.io.*;
import java.awt.event.*;


public class ATM extends JFrame 
{
 JButton button1;
 JButton button2;
 JButton button3;
 JFrame frame;
 JLabel label;
 JPanel panel;

 public ATM()
 {
  frame = new JFrame();
  frame.setSize(500,500);
  label = new JLabel("");
  panel = new JPanel();
  button1 = new JButton("Deposit");
  button2 = new JButton("Withdraw");
  button3 = new JButton("Check balance");


  
  panel.add(label);
  panel.add(button1);
  panel.add(button2);
  panel.add(button3);
  frame.add(panel);
  frame.setVisible(true);
 }

 public void withdraw(BankAccount account, double amount)
 {
  double current = account.getBalance();
  if (current >= amount)
  {
   double update = current - amount ;
   account.setBalance(update);
   System.out.println("Your have withdrawed R"+ amount+" successfully.");

  }
  else
  {
   System.out.println("You have insufficient funds to withdraw this amount.");
  }
  
 }
 
 public void deposit(BankAccount account, double amount)
 {
  double current = account.getBalance();
  double update = current + amount ;
  account.setBalance(update);
  System.out.println("Your have deposited R"+ amount+" successfully.");


 }
 
 public void checkBalance(BankAccount account)
 {
  double balance= account.getBalance();
  System.out.println("Your current balance is R"+balance+".");
 }
 
 
  public void setUpButtonListeners(BankAccount account)
 {
 //For withdraw
  ActionListener buttonListener2 = new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
    double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to withdraw")); 
    withdraw(account,amount);
   }
   
  };
  
 //For deposit
  ActionListener buttonListener1 = new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
    double amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to deposit")); 
    deposit(account,amount);
   }
   
  };

 
 //For getBalance
  ActionListener buttonListener3 = new ActionListener()
  {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
    checkBalance(account);
   }
   
  };

 
  button1.addActionListener(buttonListener1);
  button2.addActionListener(buttonListener2);
  button3.addActionListener(buttonListener3);

  
 }


 public static void main(String[] args)
 {
   int accNum = Integer.parseInt(JOptionPane.showInputDialog("Enter your account number")); 
   BankAccount account = new BankAccount(accNum);
   
   ATM h = new ATM();
   h.setUpButtonListeners(account);

 
 
 
 
 }








}