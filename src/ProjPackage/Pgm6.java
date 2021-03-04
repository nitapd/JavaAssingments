package ProjPackage;

public class Pgm6 {
    public static void main(String[] args) {
        char charvar='d';
        int ascii= charvar;
        System.out.println("The ASCII value of letter d is : " +ascii);
        int sum = ascii +3;
        System.out.println("The  value after addition of 3 to ASCII value of d is : " +sum);
        char newascii= (char)sum;
        System.out.println("The equivalent character of new value is : " +newascii);
    }
}
