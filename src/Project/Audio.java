package Project;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private int durata;

    private int volume;

    public Audio(String titolo,int durata, int volume){
        super(titolo);
        this.durata=durata;
        this.volume=volume;
    }

    @Override
    public void Play() {

    }
}
