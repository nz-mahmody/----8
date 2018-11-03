/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author pasargad
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f=999;
        int n=0;
        for(int i=1;i<1000;i++)
        {
            if(f%i==0)
            n++;
        }
        if(n==2)
            System.out.print(f);
        else
         f--;
        }
     
    }
