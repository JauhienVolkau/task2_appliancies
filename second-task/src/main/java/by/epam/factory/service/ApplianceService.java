package by.epam.factory.service;

import by.epam.factory.entity.Appliance;
import by.epam.factory.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
