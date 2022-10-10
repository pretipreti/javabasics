/*Creating constructor*/
public class Calculation{
    int x;
    int y;
    int z;
    Calculation(){//default constructor
        x=10;
        y=20;
        z=30;

    }
    Calculation(int a,int b,int c){//parameterized constructor
        x=a;
        y=b;
        z=c;
    }
    void display(){
        System.out.println(x+y+z);
    }
    public static void main(String[]args){
        Calculation C1=new Calculation();
        Calculation C2=new Calculation(100,200,300);
        C1.display();
        C2.display();
    }
}