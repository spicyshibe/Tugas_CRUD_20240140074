package com.deploy.PraktikumKTP.mapper;

import com.deploy.PraktikumKTP.dto.KtpDTO;
import com.deploy.PraktikumKTP.entity.Ktp;
import org.springframework.stereotype.Component;

@Component
public class KtpMapper {
    public KtpDTO toDTO(Ktp entity) {
        KtpDTO dto = new KtpDTO();
        dto.setId(entity.getId());
        dto.setNIK(entity.getNIK());
        dto.setNamaLengkap(entity.getNamaLengkap());
        dto.setAlamat(entity.getAlamat());
        dto.setTanggalLahir(entity.getTanggalLahir());
        dto.setJenisKelamin(entity.getJenisKelamin());
        return dto;
    }

    public Ktp toEntity(KtpDTO dto) {
        Ktp entity = new Ktp();
        entity.setId(dto.getId());
        entity.setNIK(dto.getNIK());
        entity.setNamaLengkap(dto.getNamaLengkap());
        entity.setAlamat(dto.getAlamat());
        entity.setTanggalLahir(dto.getTanggalLahir());
        entity.setJenisKelamin(dto.getJenisKelamin());
        return entity;
    }
}