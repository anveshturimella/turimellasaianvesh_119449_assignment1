package turimellaSaiAnvesh_119449_assignment1;
import turimellaSaiAnvesh_119449_assignment1.GermanCity;
import turimellaSaiAnvesh_119449_assignment1.GraphMethods;

public class GermanyGraph {

	 
		public static void main(String[] args) {
			 // create the graph among cities whose connected to each other 
	        int numberOfCities = 5; 
	        GermanCity city = new GermanCity(numberOfCities);
	        city.setLabel(0, "Berlin");
	        city.setLabel(1, "Hamburg");
	        city.setLabel(2, "Stuttgart");
	        city.setLabel(3, "Bremen");
	        city.setLabel(4, "Dresden");
	        GraphMethods.addEdge(city, 0, 1); 
	        GraphMethods.addEdge(city, 0, 4); 
	        GraphMethods.addEdge(city, 1, 2); 
	        GraphMethods.addEdge(city, 1, 3); 
	        GraphMethods.addEdge(city, 1, 4); 
	        GraphMethods.addEdge(city, 2, 3); 
	        GraphMethods.addEdge(city, 3, 4); 
	        GraphMethods.removeEdge(city,2,3);
	        GraphMethods.printUndirectedGraph(city); 
		}

}
