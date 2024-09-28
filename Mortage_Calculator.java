import java.util.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Mortage_Calculator{
    public static void main(String []args){
        int month=12;
        int percent=100;
        Scanner sc=new Scanner(System.in);
        int principal=0;
        float annual_interest_rate=0;
        int period=0;
        while(true){
        System.out.println("enter the principal amount($1K-$1M)");
        principal=sc.nextInt();
        if(principal>=1000 && principal<=1000000){
            break;
        }
        System.out.println("enter the principal amount between 1000 to 1000000");
        }while(true){
        System.out.println("enter the annual interest rate");
        annual_interest_rate=sc.nextFloat();
        if (annual_interest_rate>0 && annual_interest_rate<=30){
            break;
        }
        System.out.println("enter the annual interest rate between 1 to 30");
        }
        float annual_percent=annual_interest_rate/month/percent;
        while(true){
        System.out.println("enter the number of years");
        period=sc.nextInt();
        if(period>0 && period<=30){
            break;
        }
        System.out.println("enter the period between 1 to 30");
        }
        float period_month=period*month;
        double mortage=principal*(annual_percent*Math.pow(1+annual_percent,period_month)/(Math.pow(1+annual_percent,period_month)-1));
        System.out.println("$"+(float)mortage);
        
    }
}
