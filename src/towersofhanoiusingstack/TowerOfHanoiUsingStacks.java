/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoiusingstack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author todoslosdays
 */
import java.util.*;
 
 /* Class TowerOfHanoiUsingStacks */
 public class TowerOfHanoiUsingStacks
 {
     public static int Number;
     /* Creating Stack array  */
     public static Stack<Integer>[] tower = new Stack[4]; 
 
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         /* Accepting number of disks */         
         System.out.println("Enter number of disks");
         int num = scan.nextInt();
         Number = num;
         place(num);
     }
     /* Function to push disks into stack */
     public static void place(int n)
     {
         for (int d = n; d > 0; d--)
             tower[1].push(d);
         display();
         move(n, 1, 2, 3);         
     }
     /* Recursive Function to move disks */
     public static void move(int n, int a, int b, int c)
     {
         if (n > 0)
         {
             move(n-1, a, c, b);     
             int d = tower[a].pop();                                             
             tower[c].push(d);
             display();                   
             move(n-1, b, a, c);     
         }         
     }
     /*  Function to display */
     public static void display()
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = Number - 1; i >= 0; i--)
         {
             String display1 = " ", display2 = " ", display3 = " ";
             try
             {
                 display1 = String.valueOf(tower[1].get(i));
             }
             catch (Exception e){
             }    
             try
             {
                 display2 = String.valueOf(tower[2].get(i));
             }
             catch(Exception e){
             }
             try
             {
                 display3 = String.valueOf(tower[3].get(i));
             }
             catch (Exception e){
             }
             System.out.println("  "+display1+"  |  "+display2+"  |  "+display3);
         }
         System.out.println("\n");         
     }
 }
