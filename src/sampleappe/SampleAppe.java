
package sampleappe;

import java.util.Scanner;

public class SampleAppe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Birth Year: ");
        int by = sc.nextInt();
        
            int age = 2025 - by;
            
        System.out.println("\nHello "+name+" youe age is "+age);
        
    }
    
}
