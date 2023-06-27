package kepAlkotas.geppel.type_accessories;

import kepAlkotas.geppel.AnalogKamera;
import kepAlkotas.geppel.DigitalisKamera;

public interface Mozgokep {
    int tekercsHossz();
    int fPS(DigitalisKamera digitalisKamera);
    int fPS(AnalogKamera analogKamera);
}
