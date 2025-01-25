package com.ust.capstone.project_cost_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.capstone.project_cost_service.dao.ProjectCostRepository;
import com.ust.capstone.project_cost_service.dao.entity.ProjectCost;

@Service
public class ProjectCostService {

    @Autowired
    public ProjectCostRepository costRepo;

    public ProjectCost getCost(Long id) {
        return costRepo.findById(id).orElse(null);
    }

    public ProjectCost addCost(ProjectCost newCost) {
        return costRepo.saveAndFlush(newCost);
    }

    public ProjectCost updateCost(ProjectCost updatedCost) {
        return costRepo.save(updatedCost);
    }

    public void deleteCost(Long id) {
        costRepo.deleteById(id);
    }

}
