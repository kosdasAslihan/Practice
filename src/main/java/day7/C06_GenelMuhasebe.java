package day7;

public interface C06_GenelMuhasebe {

    //public abstract double ekMesaiHesapla();
    double ekMesaiHesapla(int calismaSaati);
    double vergiHesapla(double brutMaas, int calismaYili);
    double netMaas(double brutMaas, int calismaSaati,int calismaYili);
}
