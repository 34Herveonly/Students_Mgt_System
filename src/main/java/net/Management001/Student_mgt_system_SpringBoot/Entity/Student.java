package net.Management001.Student_mgt_system_SpringBoot.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Student Imformation")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long regNo;//Registration number.

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private double percentage;

    @Column
    private String Major;
}
