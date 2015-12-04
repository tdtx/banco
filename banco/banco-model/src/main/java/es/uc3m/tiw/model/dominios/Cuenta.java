package es.uc3m.tiw.model.dominios;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cuenta implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String dni;
	double saldo;
	String tarjeta;
	
	public Cuenta() {
		super();
	}
	
	public Cuenta(Long id, String dni, double saldo, String tarjeta) {
		super();
		this.id = id;
		this.dni = dni;
		this.saldo = saldo;
		this.tarjeta = tarjeta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
