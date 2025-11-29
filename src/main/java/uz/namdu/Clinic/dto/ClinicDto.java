package uz.namdu.Clinic.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link uz.namdu.Clinic.entity.Clinic}
 */
@Value
public class ClinicDto implements Serializable {
    String name;
    String director;
    String phoneNumber;
    UUID addressId;
}