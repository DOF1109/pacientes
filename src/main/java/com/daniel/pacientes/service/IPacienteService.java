package com.daniel.pacientes.service;

import com.daniel.pacientes.model.Paciente;

import java.util.List;

public interface IPacienteService {
    void addPaciente(Paciente paciente);
    void updatePaciente(Long id, Paciente paciente);
    void deletePaciente(Long id);
    Paciente getPacienteById(Long id);
    List<Paciente> getAllPacientes();
    // Paciente findPacienteByDni(String dni);
}
