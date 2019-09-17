package pl.programator;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int i = 0;


        String a = "abc";

        a.charAt(1);
        while(input.equals("Wykonuj") && i < 3) {
            System.out.println("Wykonuję !!");
            i++;
            input = scanner.nextLine();
        }
    }
}
