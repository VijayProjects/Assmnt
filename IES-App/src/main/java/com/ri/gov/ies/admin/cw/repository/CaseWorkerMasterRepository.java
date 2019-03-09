package com.ri.gov.ies.admin.cw.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ri.gov.ies.admin.cw.entity.CaseWorkerEntity;

@Repository("cwRepository")
public interface CaseWorkerMasterRepository extends JpaRepository<CaseWorkerEntity, Serializable> {

}
