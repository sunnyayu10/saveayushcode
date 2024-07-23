package com.testprogrammes;

class Animal
{
	int numberofLegs = 4;
	
	public void Eat()
	{
		System.out.println("Animals Eat");
	}
	
	
}
//Single Inheritance
class Dog extends Animal
{
	public void DogMethod()
	{
		System.out.println("This is dog here and I eat Bones");
	}
	
}
//Multi level inheritance
class Puppy extends Dog
{
	
	public void PuppyMethod()
	{
		System.out.println("This is puppy here and I drink milk");
	}
	
}

//Heirachical Inheritance

class Cat extends Animal
{
	
	public void CatMethod()
	{
		System.out.println("This is cat here and I also drink milk");
	}
	
}

public class InheritanceClass {
	public static void main(String args[])
	{
		Animal a1 = new Animal();
		
		a1.Eat();
		
		Dog d1 = new Dog();//we can call parent class properties by creating the object of child class. 
		
		d1.DogMethod();
		
		d1.Eat();
		
		Puppy obj= new Puppy();
		obj.PuppyMethod();
		System.out.println(obj.numberofLegs);
		
	}
}
