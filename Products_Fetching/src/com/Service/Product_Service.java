package com.Service;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import com.Management.Products_Management;
import com.Module.Products;

public class Product_Service {
	
	public void processData() {
		Products_Management products_Management=new Products_Management();
		List<Products> prod_dataList=products_Management.getInfo();
		
//		prod_dataList.stream().filter((s)->s.getPrice()>100).forEach(System.out::println);
		
		//get title length
//		List<Integer> mapDataList=prod_dataList.stream().filter((s)->s.getPrice()>100).map((m)->m.getTitle().length()).toList();
//		System.out.println(mapDataList);
		
		//map the title to price
//		List<String> titlesAndPrices = prod_dataList.stream()
//                .map(p -> p.getTitle() + " ($" + p.getPrice() + ")")
//                .collect(Collectors.toList());
//        titlesAndPrices.forEach(System.out::println);
		
//		List<Products> compareByRatings= prod_dataList.stream().sorted(Comparator.comparingDouble(Products::getRating)).toList();
		
	    
		//sort by brand
//		List<String> compareBystringList=prod_dataList.stream().map(Products::getBrand).
//				sorted().toList();
//		System.out.println(compareBystringList);

		
		Map<String, Double> prodMap=new HashMap<>();
		
		for(Products i:prod_dataList) {
			prodMap.put(i.getBrand(), i.getPrice());
		}
		
		List<Map.Entry<String, Double>> list=prodMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
		System.out.println(list);
//		prodMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((e)->System.out.println(e.getKey()+"->"+e.getValue()));
//		prodMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//Add values to map using collectors
//		Map<String, Double> productPriceMap = prod_dataList.stream()
//			    .collect(Collectors.toMap(
//			        Products::getTitle,   // key mapper (title)
//			        Products::getPrice    // value mapper (price)
//			    ));
		
		
		
	}

}
