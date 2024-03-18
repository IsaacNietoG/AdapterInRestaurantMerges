package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ingredientes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  El decorador correspondiente al ingrediente Jitomate en un submarino en WaySub.
 *  */
public class Jitomate implements ComidaWaySub{
    ComidaWaySub decorable;

    public Jitomate(ComidaWaySub decorable){
        this.decorable = decorable;
    }
	@Override
    public String descripcionIngrediente() {
         return decorable.descripcionIngrediente() + "jitomate, ";
    }

    @Override
    public double costoIngediente() {
        return decorable.costoIngediente()+15.00;
    }
}
