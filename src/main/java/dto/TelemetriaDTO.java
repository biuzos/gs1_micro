package dto;

import java.time.LocalDateTime;

public class TelemetriaDTO {

	private Long id;
	private double latitude;
	private double longitude;
	private double altitude;
	private double velocidade;
	private double direcao;
	private LocalDateTime tempo;
	private DroneDTO droneDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getDirecao() {
		return direcao;
	}

	public void setDirecao(double direcao) {
		this.direcao = direcao;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

	public DroneDTO getDroneDTO() {
		return droneDTO;
	}

	public void setDroneDTO(DroneDTO droneDTO) {
		this.droneDTO = droneDTO;
	}

}
