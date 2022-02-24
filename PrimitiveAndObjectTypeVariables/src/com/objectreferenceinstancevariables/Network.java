package com.objectreferenceinstancevariables;

public class Network {
	int id;
	Network p;
	Network(int x, Network n){
		id = x;
		p = this;
		//if(n!=null)
		//p=n;
	}
	void go(Network n1) {
		Network n = new Network(0, p);
		System.out.println(n.p); 
		Network n2 = new Network(2, n1);
		Network n3 = new Network(3, n2);
		System.out.println(n2.p);
		System.out.println(n2.id);
		System.out.println(n3.p);
		System.out.println(n3.id);
		System.out.println(n3.p.p);
		System.out.println(n3.p.p.id);
	}
	public static void main(String[] args) {
		Network n1 = new Network(1, null);
		n1.go(n1);
	}

}
