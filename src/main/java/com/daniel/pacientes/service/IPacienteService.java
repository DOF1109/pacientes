package com.daniel.pacientes.service;

import com.daniel.pacientes.model.Paciente;

import java.util.List;

public interface IPacienteService {
    void savePaciente(Paciente paciente);
    void updatePaciente(Long id, Paciente paciente);
    void deletePaciente(Long id);
    Paciente findPacienteById(Long id);
    List<Paciente> findAllPacientes();
    // Paciente findPacienteByDni(String dni);
}
