package Project;

public class Audio extends ElementoMultimediale implements Riproducibile, Volume {

    private int durata;

    private int volume;

    public Audio(String titolo,int durata, int volume){
        super(titolo);
        this.durata=durata;
        this.volume=volume;
    }

    @Override
    public void Play() {
    for(int i=0; i<durata; i++){
        System.out.println(titolo+ "" + "!".repeat(volume));
    }
    }
    @Override
    public void aumentaVolume(){
        volume++;
    }
    @Override
    public void diminuisciVolume(){
        if(volume>0){ volume--;
        } else {System.out.println("volume al minimo");}
    }

    @Override
    public void Esegui() {
        Play();
    }
}
