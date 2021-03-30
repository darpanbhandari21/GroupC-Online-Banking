package com.groupcbanking.uis.controller;

import javax.swing.*;

public class UserController
{
    public static void main(String[] args)
    {
        String decision;
        do{
            String operation = JOptionPane.showInputDialog("Enter operation: create|deposit|withdraw|balance");
            switch(operation)
            {
                case "create":
                    break;
                case "deposit":
                    break;
                case "withdraw":
                    break;
                case "balance":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Selection!!!");
            }
            decision = JOptionPane.showInputDialog("Do you want to continue? Enter y|n");
        }while(decision.equalsIgnoreCase("y"));
        JOptionPane.showMessageDialog(null, "Good Day.");
    }
}
