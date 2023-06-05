package br.com.fiap.gs1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gs1.model.TelemetriaModel;
import br.com.fiap.gs1.service.TelemetriaService;
import dto.CriaTelemetriaDTO;

@RestController
@RequestMapping("/telemetrias")
public class TelemetriaController {

	@Autowired
	private TelemetriaService telemetriaService;

	@GetMapping
	public List<TelemetriaModel> listarTelemetria() {
		return telemetriaService.listAll();
	}

	@GetMapping("/{id}")
	public TelemetriaModel buscarTelemetriaPorId(@PathVariable Long id) {
		return telemetriaService.findById(id);
	}

	@PostMapping
	public TelemetriaModel criaTelemetria(@RequestBody CriaTelemetriaDTO criaTelemetria) {
		return telemetriaService.save(criaTelemetria);
	}

	@PutMapping
	public TelemetriaModel atualizarTelemetria(@PathVariable Long id, @RequestBody TelemetriaModel telemetria) {
		return telemetriaService.update(telemetria);
	}

	@DeleteMapping("/{id}")
	public void excluirTelemetria(@PathVariable Long id) {
		telemetriaService.deletaTelemetria(id);
	}
}
