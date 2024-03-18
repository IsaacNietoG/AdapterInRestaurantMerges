package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Catsup;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Cebolla;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Jamon;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Jitomate;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Lechuga;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Mayonesa;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Mostaza;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Pepperoni;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes.Pollo;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.panes.PanBlanco;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.panes.PanMultigrano;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.panes.PanVegano;

/**
 *  Menu Interactivo para pedir un submarino en WaySub
 *
 *  Este menu es el que implementa todos los comportamientos necesarios para un menu interactivo que nos permita preparar un submarino en WaySub. Para
 *  manejarlo en nuestro sistema de tickets, al terminar de utilizar nuestro menú interactivo de esta clase, nos regresará la instancia de la comida
 *  que creamos para que podamos manipularla en nuestro sistema de Tickets.
 *
 *  */
public class menu {

    static Scanner input = new Scanner(System.in);
    static ComidaWaySub resultado;

    /**
     *  Metodo principal de nuestro menu interactivo, este es el que recibe todas las ordenes del usuario y al final del proceso nos retorna el objeto creado.
     *
     *  Realiza todo el manejo de excepciones necesario proveniente de ser una clase que reciba interacciones del usuario.
     *  */
    public static ComidaWaySub menuInteractivo(){
        resultado = null;
        System.out.println("----Bienvenido a WaySub----");
        System.out.println("Escoja un tipo de pan para su submarino.");
        System.out.println("1. Pan blanco");
        System.out.println("Precio: $20");
        System.out.println("2. Pan multigrano");
        System.out.println("Precio: $35");
        System.out.println("3. Pan vegano de frijol");
        System.out.println("Precio: $40");
        try{
            int opcion = Integer.parseInt(input.nextLine());
            asignarPan(opcion);
        }catch (Exception e){
            System.out.println("Opcion inválida, saliendo...");
            return null;
        }

        boolean terminado = false;
        while(!terminado){
            System.out.println("Selecciona el ingrediente que quieres agregar a continuacion.");
            System.out.println("1. Pollo");
            System.out.println("Precio: $25.00");
            System.out.println("2. Pepperoni");
            System.out.println("Precio: $15.00");
            System.out.println("3. Jamon");
            System.out.println("Precio: $20.00");
            System.out.println("4. Lechuga");
            System.out.println("Precio: $15.00");
            System.out.println("5. Jitomate");
            System.out.println("Precio: $15.00");
            System.out.println("6. Cebolla");
            System.out.println("Precio: $15.00");
            System.out.println("7. Mostaza");
            System.out.println("Precio: $6.00");
            System.out.println("8. Catsup");
            System.out.println("Precio: $6.00");
            System.out.println("9. Mayonesa");
            System.out.println("Precio: $6.00");
            System.out.println("--------------------");
            System.out.println("0. Salir y terminar");
            int opcion = -1;
            try{
                opcion = Integer.parseInt(input.nextLine());
            }catch (Exception e){
                terminado = false;
                System.out.println("Inserte una opcion valida");
            }
            if(opcion == 0){
                terminado = true;
                System.out.println("Eleccion de ingredientes finalizada...");
                System.out.println("Resultado final: ");
                System.out.println(resultado.descripcionIngrediente());
            }
            agregarIngrediente(opcion);
        }
        return resultado;
    }

    /**
     *  Comienza la construccion de nuestro submarino, crea un objeto acorde al pan elegido y lo guarda en la variable global que utilizaremos a lo largo del programa para seguir elaborando nuestro submarino
     *  El objeto creado será el que luego se irá recubriendo por el resto de ingredientes elegidos para el submarino. En congruencia con el patrón de diseño Decorator que usaremos
     *  en este programa para esta empresa.
     *  */
    public static void asignarPan(int opcion){
        switch (opcion){
            case 1:
                resultado = new PanBlanco();
                break;
            case 2:
                resultado = new PanMultigrano();
                break;
            case 3:
                resultado = new PanVegano();
                break;
            default:
                throw new NoSuchElementException();
        }
    }

    public static void agregarIngrediente(int opcion){
        switch(opcion){
            case 1:
                resultado = new Pollo(resultado);
                break;

            case 2:
                resultado = new Pepperoni(resultado);
                break;

            case 3:
                resultado = new Jamon(resultado);
                break;

            case 4:
                resultado = new Lechuga(resultado);
                break;

            case 5:
                resultado = new Jitomate(resultado);
                break;

            case 6:
                resultado = new Cebolla(resultado);
                break;

            case 7:
                resultado = new Mostaza(resultado);
                break;

            case 8:
                resultado = new Catsup(resultado);
                break;

            case 9:
                resultado = new Mayonesa(resultado);
                break;

            case 0:
                //No hacer nada
                break;
            default:
                System.out.println("Opcion invalida, no se agregó nada.");
        }
    }
}
