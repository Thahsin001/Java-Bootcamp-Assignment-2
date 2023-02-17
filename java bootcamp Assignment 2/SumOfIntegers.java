import java.util.*;
public class SumOfIntegers{
    public static void main(String[] args){
        int sum=0,i,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers to add");

        for(i=0;i<5;i++)
        {
            a=sc.nextInt();
            sum+=a;
        }
        System.out.println("Sum of the 5 integers= "+sum);
    }
}