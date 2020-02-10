package com.ncq.workflow;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.repositories.WorkflowRepository;


public class WorkflowRepositoryTest  extends WorkflowApplicationTests{
	
	
	 
	    @Autowired
	    private WorkflowRepository workflowRepository;
	    @Test
	    public void findByName() {
	    	
	    Workflow workflow = workflowRepository.findById(1).orElse(null);
	    
	    assertThat(workflow.getIdWorkflow())
	      .isEqualTo(1);
	    }

}
