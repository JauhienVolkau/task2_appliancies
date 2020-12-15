package by.epam.factory.service.impl;

import by.epam.factory.dao.ApplianceDAO;
import by.epam.factory.dao.DAOFactory;
import by.epam.factory.entity.Appliance;
import by.epam.factory.entity.criteria.Criteria;
import by.epam.factory.service.ApplianceService;
import by.epam.factory.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	//@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		return appliance;
	}

}