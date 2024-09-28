import java.util.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Mortage_Calculator{
    public static void main(String []args){
        int month=12;
        int percent=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount");
        int principal=sc.nextInt();
        System.out.println("enter the annual interest rate");
        float annual_interest_rate=sc.nextFloat();
        float annual_percent=annual_interest_rate/month/percent;
        System.out.println("enter the number of years");
        int period=sc.nextInt();
        float period_month=period*month;
        double mortage=principal*(annual_percent*Math.pow(1+annual_percent,period_month)/(Math.pow(1+annual_percent,period_month)-1));
        System.out.println("$"+(float)mortage);
        
    }
}