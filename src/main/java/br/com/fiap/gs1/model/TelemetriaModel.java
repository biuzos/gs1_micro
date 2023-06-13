package br.com.fiap.gs1.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telemetria")
public class TelemetriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "latitude")
	private Double latitude;

	@Column(name = "longitude")
	private Double longitude;

	@Column(name = "altitude")
	private Double altitude;

	@Column(name = "velocidade")
	private Double velocidade;

	@Column(name = "direcao")
	private Double direcao;

	@Column(name = "tempo")
	private LocalDateTime tempo;

	@ManyToOne
	@JoinColumn(name = "drone_id")
	private DroneModel drone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public Double getDirecao() {
		return direcao;
	}

	public void setDirecao(Double direcao) {
		this.direcao = direcao;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

	public DroneModel getDrone() {
		return drone;
	}

	public void setDrone(DroneModel drone) {
		this.drone = drone;
	}

	public TelemetriaModel() {

	}
	public TelemetriaModel(Double latitude, Double longitude, Double altitude, Double velocidade, Double direcao, LocalDateTime tempo, DroneModel drone) {
	    this.latitude = latitude;
	    this.longitude = longitude;
	    this.altitude = altitude;
	    this.velocidade = velocidade;
	    this.direcao = direcao;
	    this.tempo = tempo;
	    this.drone = drone;
	}

}
