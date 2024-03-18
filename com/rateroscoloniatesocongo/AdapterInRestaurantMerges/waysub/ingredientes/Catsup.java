package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Mostaza en un submarino en WaySub.
 *  */
public class Catsup implements ComidaWaySub{
    ComidaWaySub decorable;

    public Catsup(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "catsup, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+6.00;
    }
}
