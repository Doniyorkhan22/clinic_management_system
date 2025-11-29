package uz.namdu.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.namdu.Clinic.entity.Clinic;

import java.util.UUID;

public interface ClinicRepository extends JpaRepository<Clinic, UUID> {
}