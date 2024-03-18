package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Mayonesa en un submarino en WaySub.
 *  */
public class Mayonesa implements ComidaWaySub{
    ComidaWaySub decorable;

    public Mayonesa(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "mayonesa, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+6.00;
    }
}
