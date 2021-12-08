package fr.william.heritage.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vin extends Article {

	private String region;
    private String couleur;
    private int annee;
	public Vin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vin(Integer codeArticle, String designation, double prix, double remise, int quantite) {
		super(codeArticle, designation, prix, remise, quantite);
		// TODO Auto-generated constructor stub
	}
	public Vin(String region, String couleur, int annee) {
		super();
		this.region = region;
		this.couleur = couleur;
		this.annee = annee;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(annee, couleur, region);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vin other = (Vin) obj;
		return annee == other.annee && Objects.equals(couleur, other.couleur) && Objects.equals(region, other.region);
	}
	@Override
	public String toString() {
		return "Vin [region=" + region + ", couleur=" + couleur + ", annee=" + annee + "]";
	}
    
    
}
