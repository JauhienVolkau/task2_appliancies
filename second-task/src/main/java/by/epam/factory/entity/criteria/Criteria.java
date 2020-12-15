package by.epam.factory.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private String groupSearchName;
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	// you may add your own code here

}
