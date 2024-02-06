package com.mit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//AFunctional interface is an interface
interface MyFunctionalInterface{
	public String display();
	
}
public class DemoOnLambda implements MyFunctionalInterface{
	public static void main(String[] args) {
		
//		MyFunctionalInterface mfi=new DemoOnLambda();
//		mfi.display();
//		
		
		MyFunctionalInterface mfi=()->{
			return "MIT-SOE";
		};
		System.out.println(mfi.display());
		
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(89);
		intList.add(45);
		intList.add(89);
		intList.add(45);
		intList.add(89);
		intList.add(45);
		intList.add(88);
		intList.add(45);
		intList.add(88);
		intList.add(45);
		
		
		for(Integer i:intList)
			System.out.println(i);
		List<Integer> evenIntList=intList.stream().filter((num)->num%2==0).collect(Collectors.toList());
		
		System.out.println("Even Numbers");
		for(Integer i:evenIntList)
			System.out.println(i);
		
	}

	@Override
	public String display() {
		return "MIT-SOE";
	}

}
