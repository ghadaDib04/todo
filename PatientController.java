package com.example.todolist.Patients;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/MealMaker")
public class PatientController {


    @Autowired
    PatientReposetory patientReposetory;
    public PatientController(PatientReposetory patientReposetory) {
        this.patientReposetory = patientReposetory;
    }

    @GetMapping
    public List<Patient> getPatients() {
        return patientReposetory.findAll();
    }

    @PostMapping("/addPatient")
    public Patient addTask(@Valid @RequestBody Patient patient) {
        return patientReposetory.save(patient);
    }

    @PutMapping ("/changeName/{id}/{FirstName}")
    public ResponseEntity changeName(@PathVariable Integer id , @PathVariable String FirstName) {
        boolean exist = patientReposetory.existsById(id);
        if(exist){
            Patient patient = patientReposetory.getById(id);
            patient.setFirstnamePat(FirstName);
            patientReposetory.save(patient);
            return new ResponseEntity<>( "Name is updates" , HttpStatus.OK);
        }
        return new ResponseEntity<>( "Patient dosn't exist" , HttpStatus.BAD_REQUEST);
    }

    @PutMapping ("/changeLastN/{id}/{LastName}")
    public ResponseEntity chaneLastN(@PathVariable Integer id , @PathVariable String LastName) {
        boolean exist = patientReposetory.existsById(id);
        if(exist){
            Patient patient = patientReposetory.getById(id);

            patient.setLastnamePat(LastName);
            patientReposetory.save(patient);
            return new ResponseEntity<>( "Last name is updates" , HttpStatus.OK);
        }
        return new ResponseEntity<>( "Patient dosn't exist" , HttpStatus.BAD_REQUEST);
    }


}
