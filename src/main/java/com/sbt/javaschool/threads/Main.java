package com.sbt.javaschool.threads;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " task");

        //task.run();

        /*Thread thread = new Thread(task);
        thread.start();*/

        /*Thread thread1 = new Thread(task, "mythread") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " task");
            }
        };

        thread1.start();*/

        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }

    }
}
