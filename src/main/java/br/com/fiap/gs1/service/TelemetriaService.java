package br.com.fiap.gs1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gs1.model.TelemetriaModel;
import br.com.fiap.gs1.repository.TelemetriaRepository;
import dto.CriaTelemetriaDTO;

@Service
public class TelemetriaService {

	@Autowired
	private TelemetriaRepository telemetriaRepository;

	public List<TelemetriaModel> listAll() {
		return telemetriaRepository.findAll();
	}

	public TelemetriaModel findById(Long id) {
		TelemetriaModel[] telemetria = new TelemetriaModel[1];
		Optional<TelemetriaModel> telemetriaOp = telemetriaRepository.findById(id);
		telemetriaOp.ifPresent(t -> {
			telemetria[0] = t;
		});
		return telemetria[0];
	}

	public TelemetriaModel save(CriaTelemetriaDTO criaTelemetriaDto) {
		TelemetriaModel telemetria = new TelemetriaModel();
		telemetria.setLatitude(criaTelemetriaDto.getLatitude());
		telemetria.setLongitude(criaTelemetriaDto.getLongitude());
		telemetria.setAltitude(criaTelemetriaDto.getAltitude());
		telemetria.setVelocidade(criaTelemetriaDto.getVelocidade());
		telemetria.setDirecao(criaTelemetriaDto.getDirecao());
		telemetria.setTempo(criaTelemetriaDto.getTempo());

		return telemetriaRepository.save(telemetria);
	}

	public TelemetriaModel update(TelemetriaModel updateTelemetria) {
		return telemetriaRepository.save(updateTelemetria);
	}
	public void deletaTelemetria(Long id) {
		TelemetriaModel telemetria = this.findById(id);
		telemetriaRepository.delete(telemetria);
	}
}
