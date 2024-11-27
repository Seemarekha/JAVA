package com.inheritance.Multi_Level;

class Animal{
	void sound()
	{
		System.out.println("sounds...");
	}
}
class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("Barking");
	}
	
	
}
class BabyDog extends Dog{
	void drinkMilk()
	{
		System.out.println("Drinking milk");
	}
	
}
public class Test {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.sound();
		
		Dog d=new Dog();
		d.sound();
		
		BabyDog b=new BabyDog();
		b.sound();
		b.drinkMilk();
	}

}
