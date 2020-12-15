package by.epam.factory.dao;

import by.epam.factory.entity.Appliance;
import by.epam.factory.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
