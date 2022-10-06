// built-in --> Javanın içinde var

import math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınız:");
        String name = scan.nextLine();

        System.out.println("Hello "+ name);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));
        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
    }
}