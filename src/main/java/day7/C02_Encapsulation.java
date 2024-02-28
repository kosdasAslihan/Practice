package day7;

public class C02_Encapsulation {
    public static void main(String[] args) {
        C01_Encapsulation obj = new C01_Encapsulation(); //isim=null, soyisim=null, age=0
        //obj.isim;

        //Ali,Can,25 özelliklerine sahip bir obje oluşturunuz ve yazdırınız
        C01_Encapsulation objAli = new C01_Encapsulation("Ali","Can",25);
        System.out.println(objAli); //{isim='Ali', soyisim='Can', age=25}

        //yaşı 30 olarak güncelleyiniz
        objAli.setAge(30);
        System.out.println(objAli); //{isim='Ali', soyisim='Can', age=30}

        //değişkenleri set edilmemiş ikinci bir obje oluşturunuz ve yazdırınız
        C01_Encapsulation objAyse = new C01_Encapsulation();
        System.out.println(objAyse); //{isim='null', soyisim='null', age=0}

        //Ayşe,Yılmaz, 40 değerlerini set ediniz ve yazdırınız
        objAyse.setIsim("Ayse");
        objAyse.setSoyisim("Yilmaz");
        objAyse.setAge(40);
        System.out.println(objAyse); //{isim='Ayse', soyisim='Yilmaz', age=40}

        //yaşını -5 olarak güncelleyiniz ve yazdırınız
        objAyse.setAge(-5);
        System.out.println(objAyse); //{isim='Ayse', soyisim='Yilmaz', age=-5}

        //yaş negatif değer olmamalı, gerekli düzeltmeyi yapınız.
        /*Yaş değeri negatif olamaz
        {isim='Ayse', soyisim='Yilmaz', age=40}*/

        //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        System.out.println(objAli.getIsim()); //A**
        System.out.println(objAyse.getSoyisim());//Y*****

        //getter metodunda gerekli düzeltmeyi yapınız.



    }
}
