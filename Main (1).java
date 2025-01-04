

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("Choose your operator");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        
        int operator=sc.nextInt();
        
        double num1=sc.nextInt();
        double num2=sc.nextInt();
        
        switch(operator){
            case 1:
                System.out.println("1.Addition:"+(num1+num2));
                break;
            case 2:
                System.out.println("2.Subtraction:"+(num1-num2));
                break;
            case 3:
                System.out.println("3.Multiplication:"+(num1*num2));
                break;
            case 4:
                System.out.println("4.Division:"+(num1/num2));
                break;
                
            
                
                
        }
     sc.close();   
    }
}