package com.example.patientrecordsystem.Repository;

import com.example.patientrecordsystem.Model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
}
