package day6.inheritance01;

public class Child extends Parent{
    public static void main(String[] args) {

        System.out.println(Parent.isim); //Ali
        System.out.println(isim); //Ali

        Parent.method1(); //Parent class static method1
        method1(); //Parent class static method1

        Parent p = new Parent();
        System.out.println(p.yas); //30

        Child c = new Child();
        System.out.println(c.yas); //30

        Parent parent = new Child();
        System.out.println(parent);

    }
}
