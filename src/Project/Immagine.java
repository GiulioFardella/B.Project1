package Project;

public class Immagine extends ElementoMultimediale implements Luminosita {
   private int luminosita;

   public Immagine(String titolo,int luminosita){
      super(titolo);
      this.luminosita=luminosita;
   }

   @Override
   public void alzaLuminosita() {
      luminosita++;
   }

   @Override
   public void abbassaLuminosita() {
      if (luminosita > 0) {
         luminosita--;
      } else { System.out.println("luminosità al minimo");}
   }


   public void show(){
      System.out.println(titolo+ "" + "!".repeat(luminosita));
   }

   @Override
   public String toString() {
      return "Immagine{" + titolo +
              "luminosita=" + luminosita +
              '}';
   }

   @Override
   public void Esegui() {
    show();
   }
}

