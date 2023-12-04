package exercises;

import exceptions.HandleArraysException;
import exceptions.HandleInputNumbersException;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)  throws HandleArraysException {

        Scanner scanner = new Scanner(System.in);

    int [] num = {2, 4, 1, 5, 9};
    System.out.println(Arrays.toString(num));
    do {
        System.out.println("WRITE THE NUMBER TO INSERT INTO");
        int numberToStore = scanner.nextInt();
        if (numberToStore <= 0 || numberToStore >= 6) {
            try {
                throw new HandleInputNumbersException("Invalid number");
            } catch (HandleInputNumbersException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("WRITE THE PLACE WHERE YOU WANT TO INSERT YOUR NUMBER");
        int indexPosition = scanner.nextInt();
        if (indexPosition >= 6){
            throw new HandleArraysException("Index position must be max 5");
        } else {
        num[indexPosition - 1] = numberToStore;
        System.out.println(Arrays.toString(num));
        System.out.println("INSERT 0 IF YOU WANT TO QUIT, PRESS ANOTHER NUMBER TO REPEAT");}
    } while (scanner.nextInt() != 0);
    }};



