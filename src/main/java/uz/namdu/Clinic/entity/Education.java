package uz.namdu.Clinic.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String institution;

    @Column(nullable = false)
    private String degree;
    @Column(nullable = false)
    private int graduationYear;

    @ManyToOne
    private Doctor doctor;
}
