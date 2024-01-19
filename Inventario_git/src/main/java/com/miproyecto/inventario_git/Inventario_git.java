package com.miproyecto.inventario_git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Inventario_git {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> Productos = new ArrayList<>();
    static ArrayList<Float> Precio = new ArrayList<>();
    static ArrayList<Integer> Cantidad = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nMenú:");

            System.out.println("1. Añadir productos y sus detalles: ");

            System.out.println("2. Actualizar producto: ");

            System.out.println("3. Inventario actualizado: ");

            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:
                    while (true) {
                        System.out.print("Ingrese el producto ");
                        String nuevoProducto = sc.nextLine();

                        if (!Productos.contains(nuevoProducto)) {

                            Productos.add(nuevoProducto);
                            Collections.sort(Productos);
                            System.out.println("Producto agregado");

                        } else {
                            System.out.println("Ya has agregado este producto");
                        }
                        
                        

                        System.out.println("¿Cual es el precio del producto?");

                        float nuevoPrecio = sc.nextFloat();

                        if (!Precio.contains(nuevoPrecio)) {
                                Precio.add(nuevoPrecio);
                            
                            
}
                            int nuevaCantidad = sc.nextInt();

                            if (!Cantidad.contains(nuevaCantidad)) {
                                System.out.println("¿Cual es la cantidad en stock del producto?");
                                int cantidad = sc.nextInt();
                                Cantidad.add(nuevaCantidad);

                            }
                        
                        break;
                    }

                case 2:
                    System.out.println("Indique el nombre del producto a actualizar");
                    String buscarProducto= sc.nextLine();
                    
                            
                            
                    System.out.println("Nombre Actualizado: ");
                    String nuevoNombre= sc.nextLine();
                    
                    System.out.println("Nombre Actualizado: ");
                    float laMulta= sc.nextInt();
                    
                    System.out.println("Nombre Actualizado: ");
                    int nuevoStock= sc.nextInt();
                    
                    int i = BuscarProducto();
                    
                    Productos.set(i,nuevoNombre);
                    Precio.set(i,laMulta);
                    Cantidad.set(i,nuevoStock);
                    
                    break;
                    
                case 3:
                
                    for(int j=0;j<Productos.size();j++)
                    {
                        System.out.println("Nombre: " + Productos.get(j));
                        System.out.println("Precio: $" + Precio.get(j));
                        System.out.println("Cantidad en stock: " + Cantidad.get(j));
                    }
            }
        }
    }

    public static int BuscarProducto() 
    {
        String BuscarProducto= sc.nextLine();
       int i = Productos.indexOf(BuscarProducto);

        if (i != -1) {
            System.out.println("Producto encontrado:");
            System.out.println("Nombre: " + Productos.get(i));
            System.out.println("Precio: $" + Precio.get(i));
            System.out.println("Cantidad en stock: " + Cantidad.get(i));
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
        return i;
    }
        
        
    }