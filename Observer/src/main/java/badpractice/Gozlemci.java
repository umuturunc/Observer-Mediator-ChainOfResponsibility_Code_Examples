package badpractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public class Gozlemci {

    @Getter
    @Setter
    private String type;    //Anne, Baba, Öğretmen

    public void haberdarEt() {
        System.out.println(type + " öğrencinin kaçtığından haberdar oldu");
    }
}
