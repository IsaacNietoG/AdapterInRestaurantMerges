package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.pizzasDonCangrejo;

import java.util.Scanner;

/**
 * Menu para pedir una pizza en Pizzas Don Cangrejo.
 *
 * Con un funcionamiento similar al menu de WaySub, excepto que solo existen 5 tipos fijos de Pizzas.
 * El menu nos retorna el objeto que hemos creado.
 */
public class Menu {

    static Scanner input = new Scanner(System.in);
    static Pizza resultado;

	public static Pizza menuInteractivo(){
        resultado = null;
        System.out.println("-----Bienvenido a Pizzas Don Cangrejo-----");
        System.out.println("Estas son las pizzas que tenemos en este momento...");
        System.out.println("1. Pollero llenador");
        System.out.println("Pizza de pollo con queso cheddar y masa gruesa");
        System.out.println("Precio: $150.00");
        System.out.println("2. Respeta dietas");
        System.out.println("Pizza de jamon con queso manchego y masa delgada");
        System.out.println("Precio: $120.00");
        System.out.println("3. Pollito delgado");
        System.out.println("Pizza de pollo con queso cheddar y masa delgada");
        System.out.println("Precio: $130.00");
        System.out.println("4. Embutidote");
        System.out.println("Pizza de salchicha con queso manchego y masa gruesa");
        System.out.println("Precio: $160.00");
        System.out.println("5. Si pero no mucho");
        System.out.println("Pizza de pollo con queso manchego y masa delgada");
        System.out.println("Precio: $200.00");

        System.out.println("Elija la pizza que desea pedir: ");
        try{
            int opcion = Integer.parseInt(input.nextLine());
            crearPizza(opcion); //Crea una pizza y la guarda en resultado.
        }catch (Exception e){
            System.out.println("Opcion invalida, regresando...");
        }

        return resultado;
    }

    public static void crearPizza(int opcion){

        switch (opcion){
            case 1:
                resultado = new Pizza("cheddar", "pollo", "gruesa", 150.00);
                break;

            case 2:
                resultado = new Pizza("manchego", "jamon", "delgada", 120.00);
                break;

            case 3:
                resultado = new Pizza("cheddar", "pollo", "delgada"  , 130.00);
                break;

            case 4:
                resultado = new Pizza("manchego", "salchicha", "gruesa", 160.00);
                break;

            case 5:
                resultado = new Pizza("manchego", "pollo", "delgada", 200.00);
                break;

            default:
                System.out.println("Opcion invalida, regresando...");

        }
    }
}
