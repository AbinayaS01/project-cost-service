package com.ust.capstone.project_cost_service.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_cost")
public class ProjectCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_cost_id")
    private Long projTypCatCostBreakdown_id;

    @Column(name = "profit_cost")
    private double profitCost;

    @Column(name = "labour_cost")
    private double labourCost;

    @Column(name = "material_cost")
    private double materialCost;

    @Column(name = "variation_id")
    private Long projTypCatVarId;
}
