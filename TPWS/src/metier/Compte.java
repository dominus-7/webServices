package metier;

import java.util.Date;

@XmlRootElement
public class Compte {
	private Long code;
	private double solde;
	private Date dateCreation;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long code, double solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

}
