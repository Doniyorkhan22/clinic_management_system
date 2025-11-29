package uz.namdu.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.namdu.Clinic.entity.Address;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}