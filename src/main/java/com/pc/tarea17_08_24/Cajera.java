package com.pc.tarea17_08_24;


public class Cajera implements Runnable {
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public Cajera(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        System.out.println(nombre + " comienza a procesar la compra del " + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - initialTime) + "ms");

        for (int i = 0; i < cliente.getCarrito().length; i++) {
            this.esperarXsegundos(cliente.getCarrito()[i]);
            System.out.println(nombre + " procesando el producto " + (i + 1) + " del " + cliente.getNombre() + "->Tiempo: " + (System.currentTimeMillis() - initialTime) + "ms");
        }

        System.out.println(nombre + " ha terminado de procesar " + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - initialTime) + "ms");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
