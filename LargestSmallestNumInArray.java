import java.util.Arrays;
public class LargestSmallestNumInArray{
    public static void main(String[]args){
        int a[]={50,30,10,100,20};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum Element in array is:"+max);
        System.out.println("Minimum Element in array is:"+min);
    }
    
}