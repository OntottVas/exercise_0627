package kepAlkotas.geppel;

import kepAlkotas.geppel.type_accessories.Allokep;
import kepAlkotas.geppel.type_accessories.Analog;
import kepAlkotas.geppel.type_accessories.Vaku;

public class AnalogFenykepezoGep extends Keprogzito implements Analog, Vaku, Allokep {

    private String filmTipus;
    private int filmMeret;

    public AnalogFenykepezoGep(int zarSebesseg, int fokusz, String filmTipus, int filmMeret) {
        super(zarSebesseg, fokusz);
        this.filmTipus = filmTipus;
        this.filmMeret = filmMeret;
    }

    @Override
    public boolean vanMegFilm() {
        return false;
    }

    @Override
    public boolean feketeFeher() {
        return false;
    }

    @Override
    public boolean vaku(boolean use) {
        return false;
    }
}
