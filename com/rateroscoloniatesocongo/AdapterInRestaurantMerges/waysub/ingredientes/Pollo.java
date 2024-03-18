package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Pollo en un submarino en WaySub.
 *  */
public class Pollo implements ComidaWaySub{
    ComidaWaySub decorable;

    public Pollo(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "pollo, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+25.00;
    }
}
