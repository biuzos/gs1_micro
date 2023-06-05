package br.com.fiap.gs1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gs1.model.DroneModel;
import br.com.fiap.gs1.service.DroneService;
import dto.CriaDroneDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/drones")
public class DroneController {

	@Autowired
	private DroneService droneService;

	@GetMapping
	public List<DroneModel> listarDrones() {
		return droneService.listAll();
	}

	@GetMapping("/{id}")
	public DroneModel buscarDronePorId(@PathVariable Long id) {
		return droneService.findById(id);
	}

	@PostMapping
	public DroneModel criarDrone(@RequestBody CriaDroneDTO criaDrone) {
		return droneService.save(criaDrone);
	}

	@PutMapping
	public DroneModel atualizarCliente(@PathVariable Long id, @RequestBody DroneModel drone) {
		return droneService.update(drone);
	}

	@DeleteMapping("/{id}")
	public void excluirDrone(@PathVariable Long id) {
		droneService.deletaDrone(id);
	}

}
