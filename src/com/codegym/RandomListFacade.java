package com.codegym;

import java.util.List;

public class RandomListFacade {
	public void printRandomEvenList(){
		RandomList randomList = new RandomList();
		List<Integer> list = randomList.generateList(10, 100, 999);

		ListFilter listFilter = new ListFilter();
		list = listFilter.filterOdd(list);

		ListPrinter listPrinter = new ListPrinter();

		listPrinter.printList(list);
	}
}
