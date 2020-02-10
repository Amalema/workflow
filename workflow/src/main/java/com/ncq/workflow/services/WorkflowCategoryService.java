package com.ncq.workflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.entities.WorkflowCategory;
import com.ncq.workflow.repositories.WorkflowCategoryRepository;
@Service
public class WorkflowCategoryService {

	@Autowired
	private WorkflowCategoryRepository workflowCategoryRepository;
	
	public List<WorkflowCategory> findAll(){
		return workflowCategoryRepository.findAll();
	}
}
