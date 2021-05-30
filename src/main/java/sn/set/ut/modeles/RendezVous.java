package sn.set.ut.modeles;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "RENDEZVOUS")
public class RendezVous {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//@Column(nullable = false, updatable = false,name = "code_rv")
	@Column(name = "code_rv")
	private String codeRv;
	private String description;
	private String lieu;
	@Column(name = "date_rv")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;

	public RendezVous( String description, String lieu, LocalDate date) {
		super();
		this.description = description;
		this.lieu = lieu;
		this.date = date;
	}

	public RendezVous() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeRv() {
		return codeRv;
	}

	public void setCodeRv(String codeRv) {
		this.codeRv = codeRv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
