package br.designpattern.singleton;

public class Singleton {
	
	private static Singleton singletonInstance;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingletonInstance() {
		if(singletonInstance == null) {
			singletonInstance = new Singleton();
		} 		
		return singletonInstance;
	}
	
	public void print() {
		System.out.println("Única instância");
	}
}
