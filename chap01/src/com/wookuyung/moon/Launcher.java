package com.wookuyung.moon;

import java.util.Vector;

public class Launcher {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Com com = new Com();
		Audio aud = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		b.summary();
		b.refund(com);
		b.summary();
	}

}// end Launcher

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product() {
		this.price = 0;
		this.bonusPoint = 0;
	}
}// end Product

class Tv extends Product {

	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}// end Tv

class Com extends Product {

	Com() {
		super(200);
	}

	public String toString() {
		return "Com";
	}
}// end Com

class Audio extends Product {

	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}// end Audio

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("Price is higher than your budget.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;

		item.add(p);
		System.out.println("You're about to bought " + p);

	}// end buy

	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint += p.bonusPoint;
			System.out.println("You're about to refunded " + p);
		} else {
			System.out.println("You don't have " + p + " in your receipt");
		}
	}// end refund

	void summary() {
		int sum = 0;
		String list = "";

		if (item.isEmpty()) {
			System.out.println("You don't any in your cart.");
			return;
		} // end if

		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			list += i == 0 ? "" + p : ", " + p;
		} // end for

		System.out.println("You're total price is " + sum);
		System.out.println("You bought " + list + ".");

	}// end summary

}// end buyer
