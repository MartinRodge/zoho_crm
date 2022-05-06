package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.Entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public List<Lead> findAllLeads();

public Lead getLead(long id);

public void deleteLead(long id);
}
