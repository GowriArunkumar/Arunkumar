package collectons;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array_list_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList al=new LinkedList();
      al.add("arun");
      al.add("chandru");
      al.add("vaithees");
      al.add("akash");
      al.add("murugaraj");
      al.add(10);
      al.add(105.6f);
      al.add(true);
      al.add("vaithees");
      al.add("janakiraman");
      System.out.println(al);
      System.out.println(al.contains("arun"));
      System.out.println(al.get(3));
      System.out.println(al.lastIndexOf("vaithees"));
      System.out.println(al.indexOf("vaithees"));
      System.out.println(al.size());
      System.out.println(al.remove(4));
      System.out.println(al);
      
      
      
      ArrayList al2=new ArrayList();
      
      
      
      
      System.out.println( al2.addAll(al));
      al2.add("kumar");
      al2.add("9894363768");
      System.out.println(al2);
      System.out.println(al2.size());
      System.out.println(al2.containsAll(al));
      
	}

}
