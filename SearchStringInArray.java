import java.util.Arrays;
public class SearchStringInArray{
    public static void main(String[]args){
        String arr[]={"java","C","C++","Python"};
        String Search_str="C";
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(Search_str==arr[i]){
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