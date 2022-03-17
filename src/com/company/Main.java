package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startSys();
    }

    public static void startSys(){
        System.out.println("CALCULADORA FINA FINA");
        System.out.println("¿QUE OPERACION VAS A REALIZAR?");

        Scanner read = new Scanner(System.in);
        int option;
        int num1;
        int num2;
        double resultado;

        System.out.println("(1)-SUMA");
        System.out.println("(2)-RESTA");
        System.out.println("(3)-MULTIPLICACION");
        System.out.println("(4)-DIVISION");
        System.out.println("(5)-SALIR");
        option = read.nextInt();
        switch(option){
            case 1:
                System.out.println("---MODULO DE SUMA----");
                System.out.println("Ingresa el primer numero a sumar");
                num1 = read.nextInt();
                System.out.println("Ingresa el segundo numero a sumar");
                num2 = read.nextInt();
                resultado = sum(num1, num2);
                System.out.println("El resultado de la suma es "+resultado);
                startSys();
                break;
            case 2:
                System.out.println("---MODULO DE RESTA----");
                System.out.println("Ingresa el primer numero a restar");
                num1 = read.nextInt();
                System.out.println("Ingresa el segundo numero a restar");
                num2 = read.nextInt();
                resultado = subtraction(num1, num2);
                System.out.println("El resultado de la multiplicacion es "+resultado);
                startSys();
                break;
            case 3:
                System.out.println("---MODULO DE MULTIPLICACION----");
                System.out.println("Ingresa el multiplicando");
                num1 = read.nextInt();
                System.out.println("Ingresa el multiplicador");
                num2 = read.nextInt();
                resultado = multiplication(num1, num2);
                System.out.println("El resultado de la multiplicacion es "+resultado);
                startSys();
                break;
            case 4:
                System.out.println("---MODULO DE DIVISION----");
                System.out.println("Ingresa el dividendo");
                num1 = read.nextInt();
                System.out.println("Ingresa el divisor");
                num2 = read.nextInt();
                resultado = divition(num1, num2);
                System.out.println("El resultado de la division es "+resultado);
                startSys();
                break;
            case 5:
                System.out.println("---SALIENDO---");
                System.out.println("Hasta la proxima");
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA");
                startSys();
                break;
        }
    }
    public static int sum(int num1, int num2){
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    public static int subtraction(int num1, int num2){
        int resultado;
        resultado = num1 - num2;
        return resultado;
    }
    public static int multiplication(int num1, int num2){
        int resultado;
        if(num1==0 || num2 ==0){
            resultado= 0;
        }else{
            resultado = num1+ multiplication(num1, num2-1);
        }
        return resultado;
    }
    public static int divition(int num1, int num2){
        int resultado = 0;
        if(num2>num1){
            return resultado;
        }else{
            resultado = 1 + divition(num1-num2, num2);
        }
        return resultado;
    }
}
