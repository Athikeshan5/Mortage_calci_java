import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("fizzbuzz");
        }
        else if (num%5==0){
            System.out.println("fizz");
        }
        else if(num%3==0){
            System.out.println("buzz");
        }
        else{
            System.out.println(num);
        }
    }
}
