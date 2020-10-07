package br.designpattern.observer;

public class Product implements ProductObserver {
	
	private String nomeProduto;
	private Double precoProduto;
	
	@Override
	public void updatePrice(BlackFridayEvent event) {
		Double newPrice = (precoProduto * event.getBlackFridayDiscont())/100;
		System.out.println("O desconto no preço do "+ nomeProduto +" é de: "+newPrice);
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
}
