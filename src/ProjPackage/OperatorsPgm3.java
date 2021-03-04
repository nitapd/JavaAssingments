package ProjPackage;

import java.util.Scanner;

public class OperatorsPgm3 {
    public static void main(String[] args) {
        double celsius, faren;
        Scanner s=new Scanner(System.in);
        System.out.println("ENter temp in farenheit: ");
        faren=s.nextDouble();
        celsius=(faren-32)*(0.5556);
        System.out.println("Temp in Celcius is  : 34.7"+celsius);

    }
}
