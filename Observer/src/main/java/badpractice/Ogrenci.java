package badpractice;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Ogrenci {
    @NonNull
    private String adi;

    @NonNull
    private String soyadi;

    private boolean dersiAstiMi = false ;

}
