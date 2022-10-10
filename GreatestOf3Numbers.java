import java.util.Scanner;
public class GreatestOf3Numbers{
    public static void main(String[]args){
        //objects of the scanner class....

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();

        System.out.println("Enter the number");
        int b=sc.nextInt();

        System.out.println("Enter the number");
        int c=sc.nextInt();

        //number to be checked...
        if(a>b && a>c){
            System.out.println(a+" is largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }


    }

}