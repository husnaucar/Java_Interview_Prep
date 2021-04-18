package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class IQ3 {
	//Create a method which returns non-repeated elements from a list
	
	public static void main(String[] args) {
		
		Integer arr[] = {2,3,3,5,8,6,99,2,1,14};
		
		List<Integer> nums = new ArrayList<>();
		//1.way
		Collections.addAll(nums, arr);
		
		
		//2. way
		nums = Arrays.stream(arr).collect(Collectors.toList());
		
		System.out.println(nums);
		
		HashSet<Integer> hs = new HashSet<>(nums);
		System.out.println(hs.toString());
		
		
		
	}

}
