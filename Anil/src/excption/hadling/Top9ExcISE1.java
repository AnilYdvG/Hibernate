package excption.hadling;

import java.util.ArrayList;
import java.util.Iterator;

public class Top9ExcISE1 
{
		public static void main(String[] args) 
		{
			ArrayList<String> l = new ArrayList<String>();
			l.add("a");
			l.add("B");
			l.add("C");
			Iterator itr =l.iterator();
			System.out.println("Before removal of element");
			System.out.println(l);
			//to remove one element
			itr.next();
			itr.remove();
			System.out.println("After removing one element");
			
			//to remove whole arraylist
//			while(itr.hasNext())
//			{
//				Object o = itr.next();			//if this line is not written,ISE
//				itr.remove();
//			}
//			System.out.println("After removing all the elements of ArrayList");
			
			System.out.println(l);
			
		}
		
}
