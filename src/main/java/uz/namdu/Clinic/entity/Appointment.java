package uz.namdu.Clinic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.namdu.enums.AppointmentStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Doctor doctor;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;





}
