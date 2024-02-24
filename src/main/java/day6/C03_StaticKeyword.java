package day6;

public class C03_StaticKeyword {

    /*
            scope: Etki Alanı / Kapsam -> Değişken ve Method'ların nerede geçerli olduklarını belirtir.

            1: static variable
            2: instance variable
            3: local variable
            4: loop variable
     */

    int instanceSayi = 5;

    static int staticSayi = 10;

    public void method1(){
        System.out.println("Instance Method");
    }

    public static void method2(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {

        //Instance
        C03_StaticKeyword obj1 = new C03_StaticKeyword();
        obj1.instanceSayi = 20;

        C03_StaticKeyword.staticSayi = 15;

        System.out.println("Obj1 instanceSayi: " +obj1.instanceSayi); //Obj1 instanceSayi: 20

        System.out.println("staticSayi: " +C03_StaticKeyword.staticSayi); //staticSayi: 15

        //2. Instance
        C03_StaticKeyword obj2 = new C03_StaticKeyword();
        System.out.println("Obj2 instanceSayi: " +obj2.instanceSayi);

        obj1.method1();
        C03_StaticKeyword.method2();



    }
}
