package com.ri.gov.ies.admin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ri.gov.ies.admin.cw.entity.CaseWorkerEntity;
import com.ri.gov.ies.admin.cw.model.CaseWorkerModel;
import com.ri.gov.ies.admin.cw.repository.CaseWorkerMasterRepository;
import com.ri.gov.ies.util.EncryptPassword;


/**
 * This class is for Admin service
 * @author prabh
 *
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired(required = true)
	private CaseWorkerMasterRepository cwRepository;

	/**
	 * This method is for registering case worker
	 * @param CaseWorkerModel
	 * @return String
	 *  
	 */
	@Override
	public boolean registerCaseWorker(CaseWorkerModel cwModel) {
		// converting CaseWorkerModel class obj to CaseWorkerEntity class obj
		CaseWorkerEntity entity = new CaseWorkerEntity();
		BeanUtils.copyProperties(cwModel, entity);

		// Encrypt password using AES
		String encryptedPassword = EncryptPassword.encrypt(cwModel.getPwd());
		// set to entity obj
		entity.setPwd(encryptedPassword);
		entity.setActiveStatus("Yes");

		// invoke save() method from repository to insert data into database
		entity = cwRepository.save(entity);

		return (entity.getCaseWorkerId() > 0) ? true : false;
	}

}
