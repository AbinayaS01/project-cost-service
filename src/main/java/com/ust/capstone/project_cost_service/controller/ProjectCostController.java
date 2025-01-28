package com.ust.capstone.project_cost_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.project_cost_service.dao.entity.ProjectCost;
import com.ust.capstone.project_cost_service.service.ProjectCostService;

@RestController
@RequestMapping("/api")
public class ProjectCostController {

    @Autowired
    public ProjectCostService costService;

    @GetMapping("/projectcost/{pid}")
    public ResponseEntity<ProjectCost> getProject(@PathVariable("pid") Long id) {
        return new ResponseEntity(costService.getCost(id), HttpStatus.OK);
    }

    @PostMapping("/projectcost")
    public ResponseEntity<ProjectCost> addProject(@RequestBody ProjectCost newProj) {
        return new ResponseEntity(costService.addCost(newProj), HttpStatus.OK);
    }

    @PutMapping("/projectcost")
    public ResponseEntity<ProjectCost> updateProject(
            @RequestBody ProjectCost updatedProj) {
        return new ResponseEntity(costService.updateCost(updatedProj), HttpStatus.OK);
    }

    @DeleteMapping("/projectcost/{pid}")
    public ResponseEntity<Void> deleteProject(@PathVariable("pid") Long id) {
        costService.deleteCost(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
