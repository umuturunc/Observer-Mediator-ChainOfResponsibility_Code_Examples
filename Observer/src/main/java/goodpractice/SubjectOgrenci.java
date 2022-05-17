package goodpractice;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//Subject, yani takip edilecek nesne
@RequiredArgsConstructor
@Getter
public class SubjectOgrenci {   //Publisher-Subject
    @NonNull
    @Setter
    private String adi;

    @NonNull
    @Setter
    private String soyadi;

    private boolean dersiAstiMi;

    public void setDersiAstiMi(boolean dersiAstiMi) { //okuldan kaçtığını bildir
        System.out.println("Öğrenci okuldan kaçtı");
        this.dersiAstiMi = dersiAstiMi;
        if(dersiAstiMi) {
            bildir();
        }
    }

    private void bildir() { //notify
        for (Observer observer: gozlemciler) {
            observer.update();
        }
    }

    List<Observer> gozlemciler = new ArrayList<>();

    public void gözlemciEkle(Observer observer) {
        gozlemciler.add(observer);
    }

    public void gozlemciCikar(Observer observer) {
        gozlemciler.remove(observer);
    }

}
