package turimellaSaiAnvesh_119449_assignment1;

import java.util.LinkedList;
//Class represents each node of the graph i.e German City

public class GermanCity {
	int numberOfCities; 
	private Object [] labels; //city names
  LinkedList<Integer> neighbourCities[]; 
    
  //constructor  
  GermanCity(int numberOfCities) 
  { 
      this.numberOfCities = numberOfCities; 
      labels = new Object[numberOfCities];  
      neighbourCities = new LinkedList[numberOfCities]; //number of nodes is the size
        
      // Create a new list for each node 
      // Adjacent nodes can be stored in list 
      for(int i = 0; i < numberOfCities ; i++){ 
      	neighbourCities[i] = new LinkedList<>(); 
      } 
  } 
  public void   setLabel (int vertex, Object label) 
  { 
  	labels[vertex]=label; 
  }
  public Object getLabel (int vertex)
  {
  	return labels[vertex];
  }


}
