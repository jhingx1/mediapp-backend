package com.mitocode.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "signo")
public class Signos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;

	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signo_paciente"))
	private Paciente paciente;
	
	@Column(name = "fecha" )//,nullable = false
	private LocalDate fecha ;//LocalDateTime
	
	@Column(name = "temperatura", nullable = true, length = 150)
	private String temperatura;
	
	@Column(name = "pulso", nullable = true, length = 150)
	private String pulso;
	
	@Column(name = "ritmo", nullable = true, length = 150)
	private String ritmo;
	
	public Integer getIdSigno() {
		return idSigno;
	}
	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getPulso() {
		return pulso;
	}
	public void setPulso(String pulso) {
		this.pulso = pulso;
	}
	public String getRitmo() {
		return ritmo;
	}
	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}
	@Override
	public String toString() {
		return "Signos [idSigno=" + idSigno + ", paciente=" + paciente + ", fecha=" + fecha + ", temperatura="
				+ temperatura + ", pulso=" + pulso + ", ritmo=" + ritmo + "]";
	}
	
}
