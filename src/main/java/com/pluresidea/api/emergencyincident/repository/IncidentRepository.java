package com.pluresidea.api.emergencyincident.repository;

import com.pluresidea.api.emergencyincident.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Long> {


}
