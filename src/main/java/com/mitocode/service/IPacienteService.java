package com.mitocode.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mitocode.model.Paciente;

public interface IPacienteService extends ICRUD<Paciente,Integer>{

//	Paciente registrar(Paciente pac);
//	Paciente modificar(Paciente pac);
//	List<Paciente> listar();
//	Paciente listarPorId(Integer id);
//	void eliminar(Integer id);
	
	Page<Paciente> listarPageable(Pageable pageable);
	
}
