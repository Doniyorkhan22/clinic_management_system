package uz.namdu.Clinic.entity;
import lombok.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Doctor extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private String certificate;

    @Column()
    private double rating;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<WorkTime> workSchedule = new ArrayList<>();

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Education> educationList = new ArrayList<>();

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Clinic clinic;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;


}
