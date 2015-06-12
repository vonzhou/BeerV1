package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	
	public List<String> getBrands(String color){
		List<String> list = new ArrayList<String>();
		if(color.equals("red")){
			list.add("Red Beer 1");
			list.add("Red beeR 2");
		}else{
			list.add("HaErBin Beer");
			list.add("YanJin Beer");
		}
		return list;
	}
}
