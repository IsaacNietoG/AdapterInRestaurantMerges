package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub;

/**
 *  Interface que modela el comportamiento que deben obedecer todos los ingredientes de WaySub.
 *  En esta serie de objetos es en donde implementamos el patron de diseño Decorator
 *
 *  */
public interface ComidaWaySub {

	public double costoIngediente();
    public String descripcionIngrediente();
}
