package com.ncq.workflow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.entities.WorkflowCategory;
import com.ncq.workflow.repositories.WorkflowCategoryRepository;
import com.ncq.workflow.repositories.WorkflowRepository;

@SpringBootApplication
public class WorkflowApplication implements CommandLineRunner {

	@Autowired
	private WorkflowRepository workflowRepository;

	@Autowired
	private WorkflowCategoryRepository workflowCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(WorkflowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Workflow workflow = new Workflow();
		workflow.setName("W1");
		workflow.setDescription("des 1");
		workflow.setEnabled(2);
		workflow.setIdWorkflow(1);
		// workflowRepository.save(workflow);

		WorkflowCategory workflowCategory = new WorkflowCategory();
		WorkflowCategory parentCategory = new WorkflowCategory();

//		parentCategory.setDescription("descriptionparent");
//		parentCategory.setCreateAt(LocalDate.now());
//		parentCategory.setEnabled(true);
//		parentCategory.setLogo("logoparent");
//		parentCategory.setName("nameparent");
//		parentCategory.setUpdateAt(LocalDate.now());
//		// workflowCategory.setIdWorkflowCategory(idWorkflowCategory);
//		List<Workflow> list = new ArrayList<>();
//		list.add(workflow);
//		parentCategory.setWorkflows(list);
//	parentCategory = 	workflowCategoryRepository.save(parentCategory);
//
//		workflowCategory.setDescription("description1");
//		workflowCategory.setCreateAt(LocalDate.now());
//		workflowCategory.setEnabled(true);
//		workflowCategory.setLogo("logo");
//		workflowCategory.setName("name");
//		workflowCategory.setUpdateAt(LocalDate.now());
//	
//		workflowCategory.setParentCategory(parentCategory);
//		workflowCategoryRepository.save(workflowCategory);

	}

}
