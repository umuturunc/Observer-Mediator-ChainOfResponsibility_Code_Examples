package goodpractice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program çalışıyor");

        //Subject nesnesi
        SubjectOgrenci ogrenci = new SubjectOgrenci("Umut","Turunç");

        //Subject'i takip eden Observer'lar ekleniyor.
        ogrenci.gözlemciEkle(new AnneConcreteObserver());
        ogrenci.gözlemciEkle(new BabaConcreteObserver());
        ogrenci.gözlemciEkle(new OgretmenConcreteObserver());


        //Program çalıştıktan 5sn sonra öğrenci okuldan kaçıyor.
        Thread.sleep(5000);
        ogrenci.setDersiAstiMi(true);
    }
}
