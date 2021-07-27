package com.mitocode.service;

import java.time.LocalDateTime;
import java.util.List;

import com.mitocode.dto.ConsultaListaExamenDTO;
import com.mitocode.dto.ConsultaResumenDTO;
import com.mitocode.dto.FiltroConsultaDTO;
import com.mitocode.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta, Integer> {	
	//para evitar el bucle de consulta detalle consulta
	//Consulta registrarTransaccional(Consulta consulta);
	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);
	List<Consulta> buscarFecha(LocalDateTime fecha);
	
	//reporte
	List<ConsultaResumenDTO> listarResumen();
	
	byte[] generarReporte();
	
}
	
	
