package com.lambdas;

interface StaticInterface {
	static void staticMethod() {
		System.out.println("inside interface");
	}
}

class StaticInterfaceImpl implements StaticInterface {
	public void staticMethod() {
		System.out.println("inside class");
	}
}

public class StaticInterfaceStarter {
	public static void main(String[] args) {
		new StaticInterfaceImpl().staticMethod();
	}
}