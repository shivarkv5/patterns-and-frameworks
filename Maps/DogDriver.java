package dogs;

/*
 * @author MERRY
 * @version Sep 6, 2006
 */
import java.util.*;
public class DogDriver
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog("Standard Poodle", "Midge", 6);
		Dog dog2 = new Dog("Standard Poodle", "Zelda", 10);
		Dog dog3 = new Dog("Maltese", "Pete", 1);
		Dog dog4 = new Dog();
		
		System.out.println("Dog1 information: " + dog1);
		System.out.println();
		
		System.out.println("Dog1 breed: " + dog1.getBreed());
		System.out.println("Dog2 name: " + dog2.getName());
		System.out.println("Dog3 age: " + dog3.getAge());
		System.out.println();
		
		dog4.setBreed("Chinese Crested");
		dog4.setName("Trigger");
		dog4.setAge(2);
		
		System.out.print("Dog4 information: " + dog4.getBreed() + " ");
		System.out.print(dog4.getName() + " ");
		System.out.println(dog4.getAge());
		System.out.println();
		
		System.out.println("Comparing dog1 to dog2: " + dog1.compareTo(dog2));
		System.out.println("Comparing dog1 to dog3: " + dog1.compareTo(dog3));
		System.out.println("Comparing dog2 to dog4: " + dog2.compareTo(dog4));
		System.out.println();
		
		DogList myDogs = new DogList();
		myDogs.addDog(dog1);
		myDogs.addDog(dog2);
		myDogs.addDog(dog3);
		myDogs.addDog(dog4);
		
		System.out.println("The age of the oldest dog is: " + myDogs.getOldest());
		System.out.println("The average age of the dogs is: " + myDogs.getAverageAge());
		System.out.println();
		
		myDogs.addDog(new Dog("Chinese Crested", "Sally", 15));
		myDogs.addDog(new Dog("Chinese Crested", "Susie Q", 3));
		TreeMap<String, LinkedList<String>> myDogBreeds = myDogs.getBreeds();
		
		System.out.println("Contents of the TreeMap");
		System.out.println(myDogBreeds.entrySet());
		System.out.println();
		
		System.out.println("Dog information, sorted by breed, and then by name");
		System.out.println(myDogs);
		
	}
}

/*
Dog1 information: Standard Poodle Midge 6

Dog1 breed: Standard Poodle
Dog2 name: Zelda
Dog3 age: 1

Dog4 information: Chinese Crested Trigger 2

Comparing dog1 to dog2: -13
Comparing dog1 to dog3: 6
Comparing dog2 to dog4: 16

The age of the oldest dog is: 10
The average age of the dogs is: 4.75

Contents of the TreeMap
[Chinese Crested=[Trigger, Sally, Susie Q], Maltese=[Pete], Standard Poodle=[Midge, Zelda]]

Dog information, sorted by breed, and then by name
Chinese Crested Sally 15
Chinese Crested Susie Q 3
Chinese Crested Trigger 2
Maltese Pete 1
Standard Poodle Midge 6
Standard Poodle Zelda 10
*/
