package Project;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita, Volume {

   private int durata;
   private int luminosita;
   private int volume;

   public Video(String titolo,int durata, int luminosita, int volume){
       super(titolo);
       this.durata=durata;
       this.luminosita=luminosita;
       this.volume=volume;
   }
   @Override
    public void aumentaVolume(){
       volume++;
    }
    @Override
    public void diminuisciVolume(){
       if(volume>0){ volume--;
       } else {System.out.println("luminosità al minimo");}
   }
   @Override
   public void alzaLuminosita(){
       luminosita++;
   }
   @Override
   public void abbassaLuminosita(){
       if (luminosita > 0) {
           luminosita--;
       } else {System.out.println("volume al minimo");}
   }
    @Override
    public void Play() {
    for(int i=0;i<durata;i++){
        System.out.println(titolo+ "" + "!".repeat(volume)+""+"*".repeat(luminosita));
    }
    }

    @Override
    public void Esegui() {
        Play();
    }

    public int getVolume() {
       return volume;
    }

    public void setVolume(int nuovoVolume) {
       this.volume=nuovoVolume;
    }

    @Override
    public String toString() {
        return "Video{" + titolo +
                "durata=" + durata +
                ", luminosita=" + luminosita +
                ", volume=" + volume +
                '}';
    }
}
