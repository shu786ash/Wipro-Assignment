// Single inheritance= parent-->Child
//Multilevel inheritance= GrandParent-->Parent--> Child-->SubChild.......
// Hierarchical inheritance=Parent-->Child1-->Subchild1
//                                         -->Subchild2
//                               -->Child2
//                                -->Child3
 
package Inheritance_practice;
class Grandparent{
	void openland() {
		System.out.println("openland for use");
	}
}
class Parent1 extends Grandparent{
	void flat() {
		System.out.println("28bhk");
	}
	void car() {
		System.out.println("Baleno petrol car");
	}
	}
class Parent2 extends Grandparent{
	void flat() {
		System.out.println("28bhk");
	}
	void car() {
		System.out.println("Baleno petrol car");
	}
	}
	class childp1 extends Parent1{
		void bike() {
			System.out.println("Pulsar");
		}
	
	}
	class childp2 extends Parent2{
		void bike() {
			System.out.println("Pulsar");
		}
	
	}
public class Single_test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childp1 mohan = new childp1();
		mohan.flat();//self
		mohan.car();//parent
		mohan.bike();//parent
		mohan.openland();//grand parent
		Parent1 sohan = new Parent1();
		sohan.flat();
		sohan.car();
		sohan.openland();

	}

}
