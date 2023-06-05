package br.com.fiap.gs1.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "drones")
public class DroneModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "identificador")
	private String identificador;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "numero_serie")
	private String numeroSerie;

	@Column(name = "licenca_voar")
	private String licencaVoar;

	@Column(name = "horas_voo")
	private Integer horasVoo;

	@Column(name = "capacidade_carga")
	private Double capacidadeCarga;

	@Column(name = "capacidade_bateria")
	private Integer capacidadeBateria;

	@OneToMany(mappedBy = "drone", cascade = CascadeType.ALL)
	private List<TelemetriaModel> telemetrias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getLicencaVoar() {
		return licencaVoar;
	}

	public void setLicencaVoar(String licencaVoar) {
		this.licencaVoar = licencaVoar;
	}

	public Integer getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(Integer horasVoo) {
		this.horasVoo = horasVoo;
	}

	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public Integer getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(Integer capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public List<TelemetriaModel> getTelemetrias() {
		return telemetrias;
	}

	public void setTelemetrias(List<TelemetriaModel> telemetrias) {
		this.telemetrias = telemetrias;
	}

	public DroneModel() {
	}
}
