package day15turf;

public interface Turf {
		double getTurfPrice();
		String getTurfName();
		default String companyName()
		{
			return "ExcelR";
		}
}
