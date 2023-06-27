package kepAlkotas.geppel;

public abstract class Keprogzito {
    protected int zarSebesseg;
    protected int fokusz;

    public Keprogzito(int zarSebesseg, int fokusz) {
        this.zarSebesseg = zarSebesseg;
        this.fokusz = fokusz;
    }

    public int getZarSebesseg() {
        return zarSebesseg;
    }

    public void setZarSebesseg(int zarSebesseg) {
        this.zarSebesseg = zarSebesseg;
    }

    public int getFokusz() {
        return fokusz;
    }

    public void setFokusz(int fokusz) {
        this.fokusz = fokusz;
    }
}
