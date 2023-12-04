package exercises;

import exceptions.Fuel0Exeption;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Fuel0Exeption {
    Scanner scanner = new Scanner(System.in);

    System.out.println("INSERISCI I KM PERCORSI");
    int kilometers = (int) scanner.nextDouble();
    System.out.println("INSERISCI IL CARBURANTE CONSUMATO");
    int fuel = (int) scanner.nextDouble();
    if (fuel <= 0){
        throw new Fuel0Exeption("Invalid");
    } else {
    double rapport= (double) kilometers / fuel ;
    System.out.println("Rapporto KM/LITRO: " + rapport);}
}}
