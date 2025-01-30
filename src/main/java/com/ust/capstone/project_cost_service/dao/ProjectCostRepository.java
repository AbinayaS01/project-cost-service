package com.ust.capstone.project_cost_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.capstone.project_cost_service.dao.entity.ProjectCost;

@Repository
public interface ProjectCostRepository extends JpaRepository<ProjectCost, Long> {
    ProjectCost findByProjTypCatVarId(Long projectId);

}
