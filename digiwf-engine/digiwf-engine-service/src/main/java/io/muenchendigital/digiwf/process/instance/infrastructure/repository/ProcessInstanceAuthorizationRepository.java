/*
 * Copyright (c): it@M - Dienstleister für Informations- und Telekommunikationstechnik der Landeshauptstadt München, 2020
 */

package io.muenchendigital.digiwf.process.instance.infrastructure.repository;

import io.muenchendigital.digiwf.process.instance.infrastructure.entity.ServiceInstanceAuthorizationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository to perform db operation on a {@link ServiceInstanceAuthorizationEntity}
 *
 * @author externer.dl.horn
 */
public interface ProcessInstanceAuthorizationRepository extends JpaRepository<ServiceInstanceAuthorizationEntity, String> {

    List<ServiceInstanceAuthorizationEntity> findAllByUserId(String userId);

    Optional<ServiceInstanceAuthorizationEntity> findByUserIdAndProcessInstanceId(String userId, String processInstanceId);
}
