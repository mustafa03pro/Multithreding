package com.mustafa.july30.multithreding;

class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        t.run();
        System.out.println("Main thread finished");
    }
}