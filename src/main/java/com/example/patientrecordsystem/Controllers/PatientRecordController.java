package com.example.patientrecordsystem.Controllers;

import com.example.patientrecordsystem.Model.PatientRecord;
import com.example.patientrecordsystem.Repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping
    public String greeting(){
        return "<h1> Welcome to the Patient Record System</h1>";
    }

    @GetMapping("/listpatient")
    public List<PatientRecord> getPatientRecord(){
        return patientRecordRepository.findAll();
    }

    @GetMapping("/patient/{id}")
    public PatientRecord getPatient(@PathVariable Long id) {
        return patientRecordRepository.findById(id).get();
    }

    @PostMapping("/addpatient")
    public List<PatientRecord> addPatientRecord(@RequestBody PatientRecord patientRecord){
        patientRecordRepository.save(patientRecord);
        return patientRecordRepository.findAll();
    }

    @DeleteMapping("/deletepatient/{id}")
    public List<PatientRecord> deletePatientRecord(@PathVariable Long id){
        patientRecordRepository.delete(patientRecordRepository.findById(id).get());
        return patientRecordRepository.findAll();
    }

    @PutMapping("/updatepatient/{id}")
    public List<PatientRecord> updatePatientRecord(@RequestBody PatientRecord patientRecord, @PathVariable Long id){
        PatientRecord patientRecord1 = patientRecordRepository.findById(id).get();
        patientRecord1.setName(patientRecord.getName());
        patientRecord1.setAddress(patientRecord.getAddress());
        patientRecord1.setAge(patientRecord.getAge());
        patientRecordRepository.save(patientRecord1);
        return patientRecordRepository.findAll();
    }
}
