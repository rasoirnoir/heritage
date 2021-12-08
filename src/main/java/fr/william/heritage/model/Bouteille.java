package fr.william.heritage.model;

import java.util.Objects;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BOUTEILLE")
public class Bouteille extends Vin {
	private int contenance;

	public Bouteille() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bouteille(Integer codeArticle, String designation, double prix, double remise, int quantite) {
		super(codeArticle, designation, prix, remise, quantite);
		// TODO Auto-generated constructor stub
	}

	public Bouteille(String region, String couleur, int annee) {
		super(region, couleur, annee);
		// TODO Auto-generated constructor stub
	}

	public Bouteille(int contenance) {
		super();
		this.contenance = contenance;
	}

	public int getContenance() {
		return contenance;
	}

	public void setContenance(int contenance) {
		this.contenance = contenance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contenance);
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
		Bouteille other = (Bouteille) obj;
		return contenance == other.contenance;
	}

	@Override
	public String toString() {
		return "Bouteille [contenance=" + contenance + "]";
	}
	
	
}
