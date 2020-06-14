package com.company.practice;

public class Thread1 implements Runnable {
    public void run(){
        System.out.printf("%d", 2);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread1());
        thread.start();
        System.out.printf("%d", 1);
        thread.join();
        System.out.printf("%d", 1);

    }
}
