package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.utilidad;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;
import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.pizzasDonCangrejo.*;
/**
 * El adaptador que utilizaremos para convertir el formato legacy de Pizzas Don Cangrejo en algo con lo que podamos trabajar
 * de manera uniforme a lo que ya tenemos en WaySub
 *
 *
 */
public class AdaptadorPizza implements ComidaWaySub{

    Pizza adaptable;

    public AdaptadorPizza(Pizza adaptable){
        this.adaptable = adaptable;
    }

    @Override
    public double costoIngediente() {
        return adaptable.getPrecio();
    }

    @Override
    public String descripcionIngrediente() {
        return "Pizza de masa " + adaptable.getMasa() + " con carne: "+ adaptable.getCarne() + " de queso " + adaptable.getQueso();
    }

}
