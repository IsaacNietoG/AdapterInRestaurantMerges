package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Jamon en un submarino en WaySub.
 *  */
public class Jamon implements ComidaWaySub{
    ComidaWaySub decorable;

    public Jamon(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "jamon,";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+20.00;
    }
}
