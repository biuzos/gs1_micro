package dto;

public class DroneDTO {
	
	private Long id;
	private String identificador;
	private String modelo;
	private String numeroSerie;
	private String licencaVoar;
	private Integer horasVoo;
	private Double capacidadeCarga;
	private Integer capacidadeBateria;

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

}
