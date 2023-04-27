package Interfaces;

public class Main {  
    public static void main(String[] args) {  
        //try block containing exception prone code
        try{    
            System.out.println("try Block:: Begin");  
            int myArray[]=new int[5];    
            System.out.println("Array element 10 : " + myArray[10]);
            myArray[5]=10/0; 
            System.out.println("hello");
        } 
        //multiple catch blocks
        
        catch(Exception e)  
        {  
            System.out.println("Exception :: " + e.getMessage ());  
        }       
        System.out.println("rest of the code");    
    }  
}