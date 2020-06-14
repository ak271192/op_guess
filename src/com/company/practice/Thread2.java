package com.company.practice;

public class Thread2 extends Thread {

    public static void main(String[] args) {
        String a = "FalabellaIndia";
        String b = new String(a);
        int value = 0;
        value = (a == b) ? 1 : 2;
        if(value == 1) {
            System.out.println("FallabellaIndia");
        } else if (value ==2) {
            System.out.println("Fallabella India");
        } else {
            System.out.println("Fallabella Chile");
        }
    }
}
