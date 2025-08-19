package com.entreprise;

import com.entreprise.services.CalculateurPrix;

public class testcalculproduit {
    public static void main(String[] args) {
        CalculateurPrix produit1 = new CalculateurPrix(13000, "Panier", 1);
        CalculateurPrix produit2 = new CalculateurPrix(80000, "Luminaire", 1);

        System.out.println("Produit : " + produit1.getProduit());
        System.out.println("Prix total TTC : " + produit1.calculerPrixTotal() + " FCFA");

        System.out.println("Produit : " + produit2.getProduit());
        System.out.println("Prix total TTC : " + produit2.calculerPrixTotal() + " FCFA");
    }
}

