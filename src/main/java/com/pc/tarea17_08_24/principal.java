package com.pc.tarea17_08_24;

public class principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});

        long initialTime = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, initialTime);

        Thread thread1 = new Thread(cajera1);
        Thread thread2 = new Thread(cajera2);

        thread1.start();
        thread2.start();
    }
}
