
package com.rateroscoloniatesocongo.AdapterInRestaurantMerges.pizzasDonCangrejo;

/**
 *  La clase que representa a una pizza de Pizzas Don Cangrejo
 *
 *  Posee los métodos y funcionamiento indicados en los requerimentos, por lo que no es compatible out-of-the box
 *  con los tickets que pensamos implementar. Cada pizza vendible por Pizzas Don Cangrejo es una instancia de esta
 *  clase, por lo que sus especificaciones se dan en el constructor.
 *  */
public class Pizza {

    String queso;
    String carne;
    String masa;
    double precio;

	public Pizza(String queso, String carne, String masa, double precio){
        this.carne = carne;
        this.queso = queso;
        this.masa = masa;
        this.precio = precio;
    }

    public String getCarne() {
        return carne;
    }

    public String getMasa() {
        return masa;
    }

    public double getPrecio() {
        return precio;
    }

    public String getQueso() {
        return queso;
    }

}
