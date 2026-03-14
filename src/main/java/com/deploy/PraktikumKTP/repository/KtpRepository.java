package com.deploy.PraktikumKTP.repository;

import com.deploy.PraktikumKTP.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    Optional<Ktp> findByNik(String nik); // Harus 'Nik' (N besar, ik kecil)
}
