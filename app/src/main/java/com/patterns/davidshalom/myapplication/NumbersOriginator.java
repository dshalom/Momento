package com.patterns.davidshalom.myapplication;

/**
 * Created by davidshalom on 01/02/15.
 */
public class NumbersOriginator {

	private int number;

	Memento setNumber(int number) {
		this.number = number;
		return new Memento(number);
	}

	public int getNumber() {
		return number;
	}


}
