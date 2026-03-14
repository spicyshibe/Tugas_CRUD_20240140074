package com.deploy.PraktikumKTP.service.impl;

import com.deploy.PraktikumKTP.dto.KtpDTO;
import com.deploy.PraktikumKTP.entity.Ktp;
import com.deploy.PraktikumKTP.mapper.KtpMapper;
import com.deploy.PraktikumKTP.repository.KtpRepository;
import com.deploy.PraktikumKTP.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {
    @Autowired private KtpRepository repository;
    @Autowired private KtpMapper mapper;

    @Override public List<KtpDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }
    @Override public KtpDTO getById(Integer id) {
        Ktp entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        return mapper.toDTO(entity);
    }
    @Override public KtpDTO save(KtpDTO dto) {
        if(repository.findByNIK(dto.getNIK()).isPresent()) throw new RuntimeException("KTP Duplikat");
        return mapper.toDTO(repository.save(mapper.toEntity(dto)));
    }
    @Override public KtpDTO update(Integer id, KtpDTO dto) {
        Ktp existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        existing.setNamaLengkap(dto.getNamaLengkap());
        existing.setAlamat(dto.getAlamat());
        existing.setTanggalLahir(dto.getTanggalLahir());
        existing.setJenisKelamin(dto.getJenisKelamin());
        return mapper.toDTO(repository.save(existing));
    }
    @Override public void delete(Integer id) { repository.deleteById(id); }
}