package Day4;

public class C05_EnUzunKelime {
    public static void main(String[] args) {
        /*

        Kullanıcıdan alınan cümledeki en uzun kelimeyi yazdiran bir kod yazınız.

        Ornek: "kullanicidan alinan cumle"

    */
        String cumle = "kullanicidan alinan cumle";

        String[] kelimeler = cumle.split(" ");

        String enUzunKelime = "";

        for (String kelime : kelimeler){
            if (kelime.length() > enUzunKelime.length()){
                enUzunKelime = kelime;
            }
        }
        System.out.println(enUzunKelime); //kullanicidan
    }


}
