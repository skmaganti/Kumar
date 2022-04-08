package come.jeanne.readandwriteobjects;

public class Swan {
	int numEggs;
	public static void main(String[] args) {
		Swan mother = new Swan();
		mother.numEggs = 1; //Setting variable
		System.out.println(mother.numEggs); //Reading variable
	}

}
