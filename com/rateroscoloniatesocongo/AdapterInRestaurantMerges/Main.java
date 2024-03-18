package com.rateroscoloniatesocongo.AdapterInRestaurantMerges;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.menu;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.pizzasDonCangrejo.Menu;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.utilidad.AdaptadorPizza;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----Bienvenido a WaySub-----");
        System.out.println("Nos hemos fusionado recientemente con Pizzas Don Cangrejo, asi que ahora vendemos Pizzas y Submarinos");
        System.out.println("Que deseas llevar hoy?");
        System.out.println("1. Submarino");
        System.out.println("2. Pizza");
        System.out.println("3. Salir");

        int opcion = -1;
        try{
            opcion = Integer.parseInt(input.nextLine());
            if(opcion <1 || opcion > 3){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Inserta una opcion valida");
            main(null);
        }

        ComidaWaySub producto = null;
        switch (opcion){
            case 1:
                producto = menu.menuInteractivo();
                break;
            case 2:
                producto = new AdaptadorPizza(Menu.menuInteractivo()); //Aqui usamos Adapter
                break;
            case 3:
                System.out.println("Vuelva pronto :D");
                System.exit(0);
        }

        if(producto == null){
            System.out.println("Algo salió mal durante tu toma de pedido, vuelve a intentarlo");
            System.exit(0);
        }

        System.out.println("=========================================================Ticket=========================================================");
        System.out.println("Fecha: " + new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        System.out.println("Producto: ");
        System.out.println("+ "+ producto.descripcionIngrediente());
        System.out.println("Total: $" + producto.costoIngediente());
        System.out.println("========================================================================================================================");
        System.out.println("Gracias por su compra :D");
    }
}
