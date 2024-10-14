package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Failfast {
	public static void main(String[] args) {
		
	 List l =new ArrayList();
	 
	 l.add(5);
	 
	l.add(10);
	l.add('d');
	l.add("kgff");
	
	System.out.println(l);
	
           Iterator it = l.iterator();
           
           //l.add(5);
           
           while(it.hasNext()){
        	   System.out.println(it.next());
        
           }
           
           
           
           System.out.println("=============");
           Vector v = new Vector();
           
           v.add(55) ;
           v.add('k');
           v.add("kgfdd");
           v.add(12.4);
           
           System.out.println(v);
           
             Enumeration e= v.elements();
             
             
             v.add(40);
             while(e.hasMoreElements()) {
            	 System.out.println(e.nextElement());
             }
           
		

	}

}
