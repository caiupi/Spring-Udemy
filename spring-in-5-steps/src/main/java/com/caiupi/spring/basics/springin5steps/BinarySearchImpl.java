package com.caiupi.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		
		return 3;
	}

	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

}
