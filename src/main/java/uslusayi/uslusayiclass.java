package uslusayi;

import java.util.Scanner;

public class uslusayiclass {
    public static void main(String[] args) {
        int num;
        Scanner inp=new Scanner(System.in);
        System.out.println("input a number:");
        num= inp.nextInt();

        for (int i=1; i<num; i*=4)
            System.out.println(i);
        System.out.println("-----------");
        for (int j=1; j<num; j*=5)
            System.out.println(j);
    }
}
