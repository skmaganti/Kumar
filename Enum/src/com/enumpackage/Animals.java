package com.enumpackage;

enum Animals {DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s){
		sound = s;
	}
}
