package inheritance;


class Animals {
	public void eat()
	{
		System.out.println("eat method");
	}
	public void sleep()
	{
		System.out.println("sleep method");
	}
}
class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Override eat method");
	}
	public void sleep()
	{
		System.out.println("Override sleep method");
	}
	public void fly()
	{
		System.out.println("in fly method");
	}
}
class Animal
{
	public static void main(String args[])
	{
		Animals a=new Animals();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}