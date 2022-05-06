package com.zohocrm.Services;


import java.util.List;

import com.zohocrm.Entities.Billing;

public interface BillingService {
	public void generateOneBill(Billing bill);
	public List<Billing> getBill();

}
