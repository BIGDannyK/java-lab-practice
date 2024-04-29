
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Arcs";
		float weight = (float)8.5565;
		String nameSlave = "SKKU";
		Crocodile cat = new Crocodile(name,weight);
		cat.getName();
		cat.setName("Arcs2");
		cat.getName();
		cat.getWeight();
		cat.setWeight((float)8.556);
		cat.getWeight();
		//cat.getNameSlave();
		//cat.setNameSlave("SNU");
		//cat.getNameSlave();
		//cat.bark();
		cat.getFood();
	}
	

}

abstract class Mammal extends Animal{
	public abstract void bark();
	public abstract void getFood();
}

abstract class Reptile extends Animal{
	public abstract void getFood();
}

class Cat extends Mammal{
	String name,nameSlave;
	float weight;
	public Cat(String n, float w, String ns) {
		name = n;
		weight = w;
		nameSlave = ns;
	}
	public void bark() {
		System.out.println("Meow");
	}
	public void getFood() {
		System.out.println("Fish");
	}
	public void getName() {
		System.out.println(name);
	}
	public void setName(String n) {
		name = n;
	}
	public void getWeight() {
		System.out.println(weight);
	}
	public void setWeight(float w) {
		weight = w;
	}
	public void getNameSlave() {
		System.out.println(nameSlave);
	}
	public void setNameSlave(String ns) {
		nameSlave = ns;
	}
}

class Dog extends Mammal{
	String name,nameSlave;
	float weight;
	public Dog(String n, float w, String ns) {
		name = n;
		weight = w;
		nameSlave = ns;
	}
	public void bark() {
		System.out.println("Bowbow");
	}
	public void getFood() {
		System.out.println("Apple");
	}
	public void getName() {
		System.out.println(name);
	}
	public void setName(String n) {
		name = n;
	}
	public void getWeight() {
		System.out.println(weight);
	}
	public void setWeight(float w) {
		weight = w;
	}
	public void getNameSlave() {
		System.out.println(nameSlave);
	}
	public void setNameSlave(String ns) {
		nameSlave = ns;
	}
}

class Crocodile extends Reptile{
	String name;
	float weight;
	public Crocodile(String n, float w) {
		name = n;
		weight = w;
	}
	public void getFood() {
		System.out.println("Meat");
	}
	public void getName() {
		System.out.println(name);
	}
	public void setName(String n) {
		name = n;
	}
	public void getWeight() {
		System.out.println(weight);
	}
	public void setWeight(float w) {
		weight = w;
	}
}