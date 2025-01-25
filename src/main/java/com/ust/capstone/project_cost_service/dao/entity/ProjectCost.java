package com.ust.capstone.project_cost_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_cost")
public class ProjectCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_cost_id")
    private Long ProjTypCatCostBreakdown_id;

    @Column(name = "variation_id")
    private Long ProjTypCatVarId;

    @Column(name = "profit_cost")
    private double ProfitCost;

    @Column(name = "labour_cost")
    private double LabourCost;

    @Column(name = "material_cost")
    private double MaterialCost;

    // mapping
    // @OneToOne
    // @JoinColumn(name = "project_type_category_verification_id")
    // private String ProjTypCatVar_name;

    // One-to-One relationship with the project variation
    // @OneToOne
    // @JoinColumn(name = "project_type_category_variation_id", referencedColumnName
    // = "project_type_category_variation_Id")
    // private ProjectTypeCategoryVariation projectTypeCategoryVariation;
    // create pojo

}
