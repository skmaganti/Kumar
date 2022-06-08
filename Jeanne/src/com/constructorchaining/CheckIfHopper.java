package com.constructorchaining;

public class CheckIfHopper implements CheckTrait{

	@Override
	public boolean test(Animal a) {
		// TODO Auto-generated method stub
		return a.canHop();
	}

}
