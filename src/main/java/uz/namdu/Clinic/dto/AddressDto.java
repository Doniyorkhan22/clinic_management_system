package uz.namdu.Clinic.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uz.namdu.Clinic.entity.Address}
 */
@Value
public class AddressDto implements Serializable {
    String region;
    String district;
    String street;
    String homeNumber;
}