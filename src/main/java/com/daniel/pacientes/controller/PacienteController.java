package com.daniel.pacientes.controller;

import com.daniel.pacientes.model.Paciente;
import com.daniel.pacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestUrl("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService pacienteService;

    @PostMapping("/add")
    public void addPaciente(Paciente paciente) {
        pacienteService.addPaciente(paciente);
    }

    @GetMapping("/getAll")
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
    }

    @PutMapping("/update/{id}")
    public void updatePaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        pacienteService.updatePaciente(id, paciente);
    }

    @GetMapping("/get/{id}")
    public Paciente getPacienteById(@PathVariable Long id) {
        return pacienteService.getPacienteById(id);
    }
}
