import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入a:");
        System.out.println("請輸入b:");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = a+b;
        float d = a-b;
        float e = a*b;
        float f = a/b ;
        System.out.println("相加="+c);
        System.out.println("相減="+d);
        System.out.println("相乘="+e);
        System.out.println("相除="+f);
    }
}
