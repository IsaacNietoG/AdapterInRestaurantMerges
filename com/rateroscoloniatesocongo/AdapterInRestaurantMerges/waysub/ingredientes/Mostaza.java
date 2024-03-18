package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Mostaza en un submarino en WaySub.
 *  */
public class Mostaza implements ComidaWaySub{
    ComidaWaySub decorable;

    public Mostaza(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "mostaza, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+6.00;
    }
}
