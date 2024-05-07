package com.example.todolist.Patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsService {
    @Autowired
    PatientReposetory patientReposetory;
    public PatientsService() {}
    public PatientsService(PatientReposetory patientReposetory) {
        this.patientReposetory = patientReposetory;
    }


}
