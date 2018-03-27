/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 *
 * @author shuvro
 */
public class Book {
    
     public String getBook() {
         return "A great book";
     }
     
     
     public String getAuthor() {
     
         return "John Doe";
     }
     
     public void turnNext(){
         
     } 
     
     public void printCurrentPage() {
         System.out.print("Print the current page");
     }
     
     
    
}
