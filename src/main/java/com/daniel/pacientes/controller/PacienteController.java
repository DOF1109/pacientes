package com.daniel.pacientes.controller;

import com.daniel.pacientes.model.Paciente;
import com.daniel.pacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService pacienteService;

    @PostMapping
    public void createPaciente(@RequestBody Paciente paciente) {
        pacienteService.savePaciente(paciente);
    }

    @GetMapping("/all")
    public List<Paciente> getAllPacientes() {
        return pacienteService.findAllPacientes();
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
    }

    @PutMapping("/{id}")
    public void updatePaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        pacienteService.updatePaciente(id, paciente);
    }

    @GetMapping("/{id}")
    public Paciente getPacienteById(@PathVariable Long id) {
        return pacienteService.findPacienteById(id);
    }
}
