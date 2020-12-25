/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nishantbank;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class bank {
    private String name;
    private String mother;
    private String father;
    private String number;
    private String password;
    private double balance;
    private int age;
    private static int t=10001;
    private int account;
    public static ArrayList<bank> obj=new ArrayList<bank>();
    public bank()
    {
        
    }
    public bank(String n, String m, String f,String aa,String p,double w,int ee)
    {
        name=n;
        mother=m; 
        father=f;
        number=aa;      
        password=p;
        balance=w;
        age=ee;
        account=t++;
        
        javax.swing.JOptionPane.showMessageDialog(null, "Your account is ="+account);
    }
    public void deposit(double w)
    {
        balance=balance+w;
        javax.swing.JOptionPane.showMessageDialog(null,"Your New Balance="+balance);
    }
    public void withdraw(double w)
    {
        if(balance>w)
        {
            balance=balance-w;
            javax.swing.JOptionPane.showMessageDialog(null,"Your New Balance="+balance);
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Insuffient Balance");
    }
    public int getAccount()
    {
        return account;
    }
    public String getPassword()
    {
        return password;
    }
    public double getBalance()
    {
        return balance;
    }
}