package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
         ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

        for(int i=0; i<5; i++){
            System.out.println("scegli il tipo di elemento multimediale, numero" + (i+1));
            System.out.println("1:audio");
            System.out.println("2:video");
            System.out.println("3:immagine");
            int scelta= scanner.nextInt();
            scanner.nextLine();
            System.out.println("inserisci il titolo");
            String nomeTitolo= scanner.nextLine();


            switch (scelta){
                case 1:
                    System.out.println("inserisci la durata audio");
                    int durataAudio= scanner.nextInt();
                    System.out.println("scegli il volume");
                    int volumeAudio =scanner.nextInt();
                    scanner.nextLine();
                    elementiMultimediali[i]= new Audio(nomeTitolo,durataAudio, volumeAudio);
                    break;

                case 2:
                    System.out.println("inserisci la durata del video");
                    int durataVideo = scanner.nextInt();

                    System.out.println("inserisci la luminosita");
                    int luminositaVideo = scanner.nextInt();
                    System.out.println("inserisci il volume");
                    int volumeVideo = scanner.nextInt();
                    elementiMultimediali[i]= new Video(nomeTitolo, durataVideo, luminositaVideo,volumeVideo);
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("inserisci la luminosita");
                    int luminositaImmagine = scanner.nextInt();
                    scanner.nextLine();
                    elementiMultimediali[i]= new Immagine(nomeTitolo, luminositaImmagine);
                    break;
                    default:
                    System.out.println("errore nella scelta");
            }
        }

        int selezionatore ;
        do {
            System.out.println("scegli un'azione");
            System.out.println("1-5, fai partire un elemento multimediale");
            System.out.println("6, modifica volume di un elemento");
            System.out.println("7 per modificare la luminosità");
            System.out.println("8 per visualizzare tutti gli elementi");
            System.out.println("0 per uscire dal programma.");

            selezionatore=scanner.nextInt();

            if(selezionatore>= 1&& selezionatore <=5){
                elementiMultimediali[selezionatore-1].Esegui();
            } else if (selezionatore==6) {
                System.out.println("scegli l'elemento di cui vuoi modificare il volume tra 1 e 5");
                    int voceDaModificare = scanner.nextInt();
                if(voceDaModificare >=1 && voceDaModificare <=5){
                    ElementoMultimediale elem= elementiMultimediali[voceDaModificare-1];
                    if(elem instanceof Audio ){
                        Audio audio = (Audio) elem;
                        System.out.println("il volume attuale è:" + audio.getVolume());
                        System.out.println("inserisci il nuovo volume");
                        int nuovoVolume = scanner.nextInt();
                        audio.setVolume(nuovoVolume);
                        System.out.println("il nuovo volume è:" + audio.getVolume());
                    } else if (elem instanceof Video) {
                        Video video=(Video) elem;
                        System.out.println("il volume attuale è:" + video.getVolume());
                        System.out.println("inserisci il nuovo volume");
                        int nuovoVolume = scanner.nextInt();
                        video.setVolume(nuovoVolume);
                        System.out.println("il nuovo volume è:" + video.getVolume());
                    } else { System.out.println("questo elemento non può essere modificato"); }
                }
            }  else if (selezionatore==8){
                System.out.println("Elementi creati:");
                for(int i=0;i< elementiMultimediali.length;i++){
                    if(elementiMultimediali[i] !=null){
                        System.out.println(elementiMultimediali[i]);
                    }
                }
            }
        }

        while (selezionatore!= 0);

            

    }
}