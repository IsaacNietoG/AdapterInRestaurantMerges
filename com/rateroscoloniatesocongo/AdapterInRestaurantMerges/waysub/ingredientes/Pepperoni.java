package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Pepperoni en un submarino en WaySub.
 *  */
public class Pepperoni implements ComidaWaySub{
    ComidaWaySub decorable;

    public Pepperoni(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "pepperoni ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+15.00;
    }
}
