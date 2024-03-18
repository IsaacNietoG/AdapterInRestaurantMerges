package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.panes;

import com.rateroscoloniatesocongo.AdapterInRestaurantMerges.waysub.ComidaWaySub;

/**
 *  Esta clase al igual que todas en el interior de este package representa un pan
 *
 *  Ya que el pan es el paso inicial de la construccion de nuestro WaySub, su constructor difiere
 *  al resto de las clases que implementan la interface {@link ComidaWaySub} en el sentido de que no es un decorador
 *  apropiado por si mismo, más bien, lo consideramos como el paso inicial y por lo tanto no es paso intermedio para elaborar
 *  un submarino.
 *  */
public class PanMultigrano implements ComidaWaySub{

	private String descripcion = "Baguette de pan multigrano con ";

    public PanMultigrano(){

    }

    @Override
    public double costoIngediente() {
        return 35.00;
    }

    @Override
    public String descripcionIngrediente() {
        return descripcion;
    }
}
