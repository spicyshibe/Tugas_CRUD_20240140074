package com.deploy.PraktikumKTP.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "ktp")
@Data
public class Ktp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nik;           // nyari kolom 'nik'
    private String namaLengkap;   // nyari kolom 'nama_lengkap'
    private String alamat;        // nyari kolom 'alamat'
    private LocalDate tanggalLahir;
    private String jenisKelamin;
}