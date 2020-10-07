package br.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Publisher extends Thread{
	
	private List<ProductObserver> observers = new ArrayList<ProductObserver>();
	
	public void addObserver(ProductObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) { 
			int valor = scanner.nextInt();
			
			if(valor == 1) {
				BlackFridayEvent event = new BlackFridayEvent(10d);
				
				for(ProductObserver observer: this.observers) {
					observer.updatePrice(event);
				}
			} else {
				System.out.println("Não rodou");
			}
			
		}
	}

}
