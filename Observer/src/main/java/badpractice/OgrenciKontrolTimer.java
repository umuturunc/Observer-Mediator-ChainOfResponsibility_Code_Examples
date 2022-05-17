package badpractice;

import lombok.AllArgsConstructor;

import java.util.TimerTask;

@AllArgsConstructor
class OgrenciKontrolTimer extends TimerTask {

    private Gozlemci gozlemci; //Anne, Baba, Rehber öğretmen
    private Ogrenci ogrenci;

    @Override
    public void run() {
        if (ogrenci.isDersiAstiMi()) {
            gozlemci.haberdarEt();
            this.cancel();
        } else System.out.println(gozlemci.getType() + " öğrenciyi kontrol etti");
    }
}
