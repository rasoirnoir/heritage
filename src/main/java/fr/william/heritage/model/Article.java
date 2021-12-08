package fr.william.heritage.model;

import java.util.Objects;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISC", discriminatorType = DiscriminatorType.STRING)
public class Article {

	@Id
	private Integer codeArticle;
    private String designation;
    private double prix;
    private double remise;
    private int quantite;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(Integer codeArticle, String designation, double prix, double remise, int quantite) {
		super();
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prix = prix;
		this.remise = remise;
		this.quantite = quantite;
	}
	public Integer getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(Integer codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getRemise() {
		return remise;
	}
	public void setRemise(double remise) {
		this.remise = remise;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codeArticle, designation, prix, quantite, remise);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(codeArticle, other.codeArticle) && Objects.equals(designation, other.designation)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix) && quantite == other.quantite
				&& Double.doubleToLongBits(remise) == Double.doubleToLongBits(other.remise);
	}
	@Override
	public String toString() {
		return "Article [codeArticle=" + codeArticle + ", designation=" + designation + ", prix=" + prix + ", remise="
				+ remise + ", quantite=" + quantite + "]";
	}
    
    
}
