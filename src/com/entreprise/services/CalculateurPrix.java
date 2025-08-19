package com.entreprise.services;

public class CalculateurPrix {
    private int prix;
    private String produit;
    private int quantite;
    public static final double TVA = 0.20;

    public CalculateurPrix(int prix, String produit, int quantite) {
        this.prix = prix;
        this.produit = produit;
        this.quantite = quantite;
    }
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double calculerPrixTotal() {
        double prixHT = prix * quantite;
        double prixTTC = prixHT + (prixHT * TVA);
        return prixTTC;
    }

    public void afficherPrixTotal() {
        System.out.println("Le prix total pour le produit " + produit + " est : " + calculerPrixTotal() + " FCFA");
    }
}
