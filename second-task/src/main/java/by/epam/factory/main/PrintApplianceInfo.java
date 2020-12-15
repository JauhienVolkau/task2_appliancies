package by.epam.factory.main;

import by.epam.factory.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) 
	{
		if(appliance!=null)
		{
			System.out.println("Прибор найден "+appliance.toString());
		}
		else 
		{
			System.out.println("Прибор не найден");
		}	
	}
	
	// you may add your own code here

}
