import java.util.Arrays;
public class SearchNumberInArray{
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        int Search_num=4;
        boolean flag=false;
        for(int i=0;i<a.length-1;i++){
        if(Search_num==a[i]){
            System.out.println("Element found:"+i);
            flag=true;
            break;
        }
        }
        if(flag==false){
            System.out.println("Element not found");
        
        }
    }
}