package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoga Elfaraby
 */
public class Sum {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println("Sum of 5 and 10 is: " + sum.add(5, 10));
    }
}
