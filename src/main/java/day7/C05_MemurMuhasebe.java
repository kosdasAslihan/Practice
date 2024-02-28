package day7;

/*çalışan memur ise;
        1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar artır
        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
        daha az ise maaşından %25 vergi kesintisi yapılıyor*/
public class C05_MemurMuhasebe implements C06_GenelMuhasebe {

    @Override
    public double ekMesaiHesapla(int calismaSaati) {
        if (calismaSaati > 120) {
            double ekMesai=(calismaSaati-120)*15;
            System.out.println("Aylık ek mesai ücreti: " + ekMesai);
            return ekMesai;
        } else {

            return 0;
        }
    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili>=10){
            vergi=brutMaas*35/100;
        }else {
            vergi=brutMaas*25/100;
        }
        System.out.println("Vergi: " + vergi);
        return vergi;
    }

    @Override
    public double netMaas(double brutMaas, int calismaSaati, int calismaYili) {
        return brutMaas+ekMesaiHesapla(calismaSaati)-vergiHesapla(brutMaas,calismaYili);
    }
}
