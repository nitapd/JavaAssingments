package ProjPackage;

import java.util.Scanner;

public class InputUserPgm1 {
    public static void main(String[] args) {
int n1,n2,sum,prod;
Scanner s=new Scanner(System.in);
        System.out.println("enter number 1");
        n1=s.nextInt();
        System.out.println("enter number 2");
        n2=s.nextInt();
        sum=n1+n2;
        System.out.println(sum);
        prod=n1*n2;
        System.out.println(prod);
    }
}
