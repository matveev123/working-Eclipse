package exercises.innerclasses.temp;

import static util.Print.*;
/* Создайте класс, не содержащий конструктор по умолчанию (конструктор без аргументов). 
 * При этом класс должен содержать конструктор, получающий аргументы.
 *  Создайте второй класс(анонимный) с методом, который возвращает ссылку на объект первого класса. 
 *  Возвращаемый объект должен создаваться посредством анонимного внутреннего класса, производного от первого.*/

class One {
	private String s;

	One(String s) {
		this.s = s;
	}

	public String showS() {
		return s;
	}
}

public class Ex15 {
	public One makeOne(String s) {
		return new One(s) {
		};
	}

	public static void main(String[] args) {
		Ex15 x = new Ex15();
		System.out.println(x.makeOne("hi").showS());
	}
}


