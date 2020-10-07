package br.designpattern.observer;

public class ExecuteEvent {

	public static void main(String[] args) {
		Product playstation4 = new Product();
		playstation4.setNomeProduto("Playstation4");
		playstation4.setPrecoProduto(2999.90);
		
		Product celularLegal = new Product();
		celularLegal.setNomeProduto("Celular Legal");
		celularLegal.setPrecoProduto(5999.90);
		
		Publisher subject = new Publisher();
		
		subject.addObserver(playstation4);
		subject.addObserver(celularLegal);
		
		subject.start();
	}

}
