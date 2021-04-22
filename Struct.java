package EstruturaHeterogênea;

import java.lang.String;

public class Struct 
{
    int a;
    double b;
    String c;
    
    public static void main(String[] args)
    {
        Struct x= new Struct();
        
        x.a= 10;
        x.b= 9.2;
        x.c= "g69jd3í";
        
        System.out.println(""+x.a);
        System.out.println(""+x.b);
        System.out.println(""+x.c);
    }
    
}
