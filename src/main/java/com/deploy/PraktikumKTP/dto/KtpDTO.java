package com.deploy.PraktikumKTP.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class KtpDTO {
    private Integer id;
    private String NIK;
    private String namaLengkap;
    private String alamat;
    private LocalDate tanggalLahir;
    private String jenisKelamin;
}