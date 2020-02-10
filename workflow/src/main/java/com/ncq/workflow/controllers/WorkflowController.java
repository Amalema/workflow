package com.ncq.workflow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.services.WorkflowService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/workflow")
@Api(description="ce web service sdfxgfchhjkl")
public class WorkflowController {
	@Autowired
	private WorkflowService workflowService;

	@ApiOperation(value="récupérer les workflows ")
	@GetMapping
	public Page<Workflow> findAll(@ApiParam(value="numero de page")@RequestParam int page ,@ApiParam(value="taille du page")@RequestParam int size){
		return workflowService.findAll(page, size);
	}
	
	
	
	@ApiOperation(value="récupérer les workflows par nom")
	@GetMapping("/findByName/{name}")
	public List<Workflow> findByName(@ApiParam(value="nom work flow")@PathVariable String name){
		return workflowService.findByName(name);
	}
	
	
	@ApiOperation(value="récupérer les workflows par categories")
	@GetMapping("/findByCategories")
	public List<Workflow> findByCategories(@ApiParam(value="1 ou plusieur id")@RequestParam Integer[] ids){
		return workflowService.findByCategories(ids);
	}
	
	
	
	@ApiOperation(value="récupérer les workflows par status")
	@GetMapping("/findByStatus/{status}")
	public List<Workflow> findByStatus(@ApiParam(value="status")@PathVariable int status){
		
			return workflowService.findByStatus(status);
	
	}
}
