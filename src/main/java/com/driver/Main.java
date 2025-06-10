package com.driver;

public class Main {
     // Task 1: Create a class Product inside Main class
    static class Product{

        //Task 3: Create a method with the following definition
         public int product(int x, int y){
             return x * y;
         }
         // Task 4: Create an overloaded method with the following definition
         public int product(int x, int y, int z){
             return x * y * z;
         }

         // Task 5: Create an overloaded method with the following definition
         public double product(double x, double y){
             return x * y;
         }
     }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();
        // Call all overloaded methods
        System.out.println("Product of 4 and 5: " + p.product(4, 5));
        System.out.println("Product of 2, 3 and 4: " + p.product(2, 3, 4));
        System.out.println("Product of 2.5 and 4.2: " + p.product(2.5, 4.2));
    }
}