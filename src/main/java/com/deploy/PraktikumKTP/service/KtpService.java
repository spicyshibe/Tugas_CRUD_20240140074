package com.deploy.PraktikumKTP.service;
import com.deploy.PraktikumKTP.dto.KtpDTO;
import java.util.List;

public interface KtpService {
    List<KtpDTO> getAll();
    KtpDTO getById(Integer id);
    KtpDTO save(KtpDTO dto);
    KtpDTO update(Integer id, KtpDTO dto);
    void delete(Integer id);
}