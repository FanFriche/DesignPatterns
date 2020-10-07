package br.designpattern.observer;

public class BlackFridayEvent {
	
	private final Double blackFridayDiscont;

	public BlackFridayEvent(Double blackFridayDiscont) {
		this.blackFridayDiscont = blackFridayDiscont;
	}

	public Double getBlackFridayDiscont() {
		return blackFridayDiscont;
	}
}
