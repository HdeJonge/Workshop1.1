package pojo;
import java.math.BigDecimal;

public class Artikel {
	Integer id;
	String naam;
	BigDecimal prijs;
	Integer voorraad;
	public Artikel(){
	}
	public Artikel(String naam, BigDecimal prijs, int voorraad) {
		this.naam = naam;
		this.prijs = prijs;
		this.voorraad=  voorraad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public BigDecimal getPrijs() {
		return prijs;
	}
	public void setPrijs(BigDecimal price) {
		this.prijs = price;
	}
	public Integer getVoorraad() {
		return voorraad;
	}
	public void setVoorraad(Integer voorraad) {
		this.voorraad = voorraad;
	}
	public String toString(){
		return "naam=" + naam 
				+ " prijs=" + prijs 
				+ " voorrad=" + voorraad;
		
	}

}
