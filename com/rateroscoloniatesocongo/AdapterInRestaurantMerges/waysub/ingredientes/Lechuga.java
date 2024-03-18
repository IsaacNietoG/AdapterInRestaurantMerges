package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Lechuga en un submarino en WaySub.
 *  */
public class Lechuga implements ComidaWaySub{
    ComidaWaySub decorable;

    public Lechuga(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "lechuga,";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+15.00;
    }
}
