package javapattern.prototype;


public class PrototypeApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX() + " , " + circle1.getY() + " , " + circle1.getR());
		System.out.println(circle2.getX() + " , " + circle2.getY() + " , " + circle2.getR());
		
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012,3));
		
		Cat yo = navi;
		
		
		yo.setName("yo");
		yo.getAge().setYear(2013);
		yo.getAge().setMonth(9);
		
		Cat yocopy = navi.copy();
		yocopy.setName("yo");
		
		System.out.println("navi's name : " + navi.getName());
		System.out.println("yo's name : " + yo.getName());
		System.out.println("yo's year : " + yo.getAge().getYear());
		System.out.println("yo's month : " + yo.getAge().getMonth());
		System.out.println("yocopy's name : " + yocopy.getName());
		System.out.println("yocopy's year : " + yocopy.getAge().getYear());
		System.out.println("yocopy's month : " + yocopy.getAge().getMonth());
		
	}
}
