package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Cebolla en un submarino en WaySub.
 *  */
public class Cebolla implements ComidaWaySub{
    ComidaWaySub decorable;

    public Cebolla(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "cebolla, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+15.00;
    }
}
