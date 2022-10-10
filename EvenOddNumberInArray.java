import java.util.Arrays;
public class EvenOddNumberInArray{
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9};
        //printing even numbers...
        System.out.println("Even numbers are.....");
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }

        //printing odd numbers...
        System.out.println("Odd numbers are.....");
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}