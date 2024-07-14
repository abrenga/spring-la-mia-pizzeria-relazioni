package it.lamiapizzeria.model;

import java.util.List;

public class PizzaDiAmministrazione {
    private ModelofmenuDB nomePizzaAmministratore;
    private List<ModelOfSpecialPrice> SpecialPriceAmministratore;

    public PizzaDiAmministrazione(ModelofmenuDB nomePizzaAmministratore, List<ModelOfSpecialPrice> SpecialPriceAmministratore ) {
        this.nomePizzaAmministratore = nomePizzaAmministratore;
        this.SpecialPriceAmministratore = SpecialPriceAmministratore;
    }


    public ModelofmenuDB getNomePizzaAmministratore() {
        return nomePizzaAmministratore;
    }
    public List<ModelOfSpecialPrice> getSpecialPriceAmministratore() {
        return SpecialPriceAmministratore;
    }

    public void setNomePizzaAmministratore(ModelofmenuDB nomePizzaAmministratore) {
        this.nomePizzaAmministratore = nomePizzaAmministratore;
    }

    public void setSpecialPriceAmministratore(List<ModelOfSpecialPrice> specialPriceAmministratore) {
        SpecialPriceAmministratore = specialPriceAmministratore;
    }
}
