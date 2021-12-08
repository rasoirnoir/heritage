package fr.william.heritage.model;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Barrique extends Vin {
	
	private int contenance;

	public Barrique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Barrique(Integer codeArticle, String designation, double prix, double remise, int quantite) {
		super(codeArticle, designation, prix, remise, quantite);
		// TODO Auto-generated constructor stub
	}

	public Barrique(String region, String couleur, int annee) {
		super(region, couleur, annee);
		// TODO Auto-generated constructor stub
	}

	public Barrique(int contenance) {
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
		Barrique other = (Barrique) obj;
		return contenance == other.contenance;
	}

	@Override
	public String toString() {
		return "Barrique [contenance=" + contenance + "]";
	}
	
	
}
