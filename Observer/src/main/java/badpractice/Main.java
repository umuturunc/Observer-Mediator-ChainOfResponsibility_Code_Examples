package badpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program çalışıyor");
        //Öğrenci nesnesini oluştur
        Ogrenci ogrenci = new Ogrenci("Umut","Turunç");

        //Gözlemcileri bir liste içerisinde tut.
        List<Gozlemci> gozlemciler = new ArrayList<>();
        gozlemciler.add(new Gozlemci("Anne"));
        gozlemciler.add(new Gozlemci("Baba"));
        gozlemciler.add(new Gozlemci("Rehber Ogretmen"));

        //Bütün gözlemciler, öğrencinin durumunu saniyede 1 kontol etsin
        for (Gozlemci person: gozlemciler) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new OgrenciKontrolTimer(person,ogrenci),0,1000);
        }
        //Gözlemciler 1sn'lik peryotlarla öğrenci durumunu kontrol etmeye başladı

        //Program çalıştıktan 5sn sonra öğrenci okuldan kaçıyor
        Thread.sleep(5000);
        System.out.println("_______****Öğrenci okuldan kaçtı*****______");
        ogrenci.setDersiAstiMi(true);
    }
}



