package com.mit.model;

import java.util.List;

public interface PlanDAO {
	List<Long> getPlanNumList();
	PlanDTO getPlanByPlanNum(String planNum);
	List<ProductDTO> getProductList();
	ProductDTO getProductByProductNum(String productNum);
	long insertPlan(PlanDTO dto);
	long updatePlan(PlanDTO dto);
}
