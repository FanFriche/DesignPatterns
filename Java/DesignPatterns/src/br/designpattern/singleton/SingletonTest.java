package br.designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonInstance();
		Singleton singleton2 = Singleton.getSingletonInstance();
		
		System.out.println(singleton == singleton2);
		System.out.println(singleton.equals(singleton2));
	}

}
