package turimellaSaiAnvesh_119449_assignment1;
import turimellaSaiAnvesh_119449_assignment1.GermanCity;

//graph methods add,remove,print

public class GraphMethods {
	// method that adds edge to graph 
	  static void addEdge(GermanCity city, int src, int dest) 
	  { 
	      // here an edge added from source to destination.  
	      city.neighbourCities[src].add(dest); 
	        
	      //here an edge added from destination to source also required.
	      city.neighbourCities[dest].add(src); 
	  } 
	  
	// method that removes edge to graph 
	  static void removeEdge(GermanCity city, int src, int dest) 
	  { 
	      // here an edge removed from source to destination.  
	      //city.neighbourCities[src].remove(dest); 
	        
	      //here an edge removed from destination to source also required.
	      city.neighbourCities[dest].remove(src); 
	  } 
	     
	  //method that print adjacency cities list to represent a graph
	  static void printUndirectedGraph(GermanCity germanCity) 
	  {        
	      for(int nodes = 0; nodes < germanCity.numberOfCities; nodes++) 
	      { 
	          System.out.println("German City - "+ germanCity.getLabel(nodes)); 
	          System.out.print("Connecting Cities"); 
	          for(Integer path: germanCity.neighbourCities[nodes]){ 
	              System.out.print(" -> "+germanCity.getLabel(path)); 
	          } 
	          System.out.println("\n"); 
	      } 
	  }

}
