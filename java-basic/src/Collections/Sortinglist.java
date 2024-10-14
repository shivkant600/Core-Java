package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sortinglist {
	
	

	public static void main(String[] args) {
		
        List l= new ArrayList();
        
       l.add(5);
       l.add(4);
       l.add(1);
       l.add(2);
       l.add(3);
       
       System.out.println("normal list="+l);
       
     //  System.out.println(l.isEmpty());
       
       Collections.shuffle(l);
       
       System.out.println("suffle take the random value="+l);
       
       
       Collections.sort(l);
       
       System.out.println("sort arrange the data in proper way"+l);
       
       Collections.reverse(l);
       
       System.out.println("reverse="+l);
       
       
     
            
      
       
       
		
		
		
	}

}
