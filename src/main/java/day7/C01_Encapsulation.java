package day7;

//Encapsulation nedir: data hiding

/*
bir class oluşturalım.
private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
parametreli ve parametresiz constructor oluşturun
toString metodunu oluşturun
 */
public class C01_Encapsulation {
    private String isim;
    private String soyisim;
    private int age;

    //parametreli const
    public C01_Encapsulation(String isim, String soyisim, int age) {
        this.isim = isim;
        this.soyisim = soyisim;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Yaş değeri negatif olamaz");
        }
    }

    public C01_Encapsulation() {
    }

    //getter

    public String getIsim() {
        if (isim!=null) {
            return isim.charAt(0) + "*".repeat(isim.length() - 1);
        }else {
            return null;
        }
    }

    public String getSoyisim() {
        if (soyisim!=null) {
            return soyisim.charAt(0) + "*".repeat(soyisim.length() - 1);
        }else {
            return null;
        }
    }

    public int getAge() {
        return age;
    }

    //setter

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Yaş değeri negatif olamaz");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", age=" + age +
                '}';
    }

    //POJO class: Plain Old Java Object
    //1-private access modifier'ına sahip fieldlar oluşturduk
    //2-paramli/paramsiz const
    //3-getter-setter
    //4-toString
}
