package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class RealLifeListUse {
	
    int id;
    String name;
    
    RealLifeListUse(int id,String name){
    	this.id=id;
    	this.name=name;
    }
    
	
	public static void main(String[] args) {
		
		List<RealLifeListUse>list=new ArrayList<>();
		list.addLast(new RealLifeListUse(1,"Rahul"));
		list.addLast(new RealLifeListUse(2,"Kajal"));
		
		for(RealLifeListUse s:list) {
			System.out.println(s.id+ " " +s.name);
		}

}}
