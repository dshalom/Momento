package com.patterns.davidshalom.myapplication;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by davidshalom on 01/02/15.
 */
public class NumberProgram {

	private NumbersOriginator numbersOriginator;
	private Stack stack;

	public NumberProgram() {
		this.numbersOriginator = new NumbersOriginator();
		stack = new Stack();
	}

	public int getNumber() {
		return numbersOriginator.getNumber();
	}

	public void setNumber(int number) {
		stack.push(numbersOriginator.setNumber(number));
	}

	public void undo() {

		try {
			Memento memento = (Memento) stack.pop();
			numbersOriginator.setNumber(memento.getMemento());
		} catch (EmptyStackException e) {
			numbersOriginator.setNumber(0);
		}
	}
}
