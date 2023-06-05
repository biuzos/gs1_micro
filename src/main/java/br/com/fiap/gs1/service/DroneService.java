package br.com.fiap.gs1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gs1.model.DroneModel;
import br.com.fiap.gs1.repository.DroneRepository;
import dto.CriaDroneDTO;

@Service
public class DroneService {
	@Autowired
	private DroneRepository droneRepository;

	public List<DroneModel> listAll() {
		return droneRepository.findAll();
	}

	public DroneModel findById(Long id) {
		DroneModel[] drone = new DroneModel[1];
		Optional<DroneModel> droneOp = droneRepository.findById(id);
		droneOp.ifPresent(d -> {
			drone[0] = d;
		});
		return drone[0];
	}


	public DroneModel save(CriaDroneDTO criaDroneDto) {
		DroneModel drone = new DroneModel();
		drone.setIdentificador(criaDroneDto.getIdentificador());
		drone.setModelo(criaDroneDto.getModelo());
		drone.setNumeroSerie(criaDroneDto.getNumeroSerie());
		drone.setLicencaVoar(criaDroneDto.getLicencaVoar());
		drone.setHorasVoo(criaDroneDto.getHorasVoo());
		drone.setCapacidadeBateria(criaDroneDto.getCapacidadeBateria());
		drone.setCapacidadeCarga(criaDroneDto.getCapacidadeCarga());
		
		return droneRepository.save(drone);
	}

	public DroneModel update(DroneModel updateDrone) {
		return droneRepository.save(updateDrone);
	}

	public void deletaDrone(Long id) {
		DroneModel drone = this.findById(id);
		droneRepository.delete(drone);
	}
}
