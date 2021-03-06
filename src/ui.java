import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ui extends JFrame {

    ArrayList<Dolgozo> dolgozoklista=new ArrayList<>();
    public ui(){

        try {
            FileReader reader = new FileReader("adatok.txt");
            BufferedReader br = new BufferedReader(reader);
            String sor=br.readLine();
            while (sor != null) {

                String [] adatok=sor.split(" ");
                String vezeteknev=adatok[0];
                String keresztnev=adatok[1];
                String nem=adatok[2];
                int kor=Integer.parseInt(adatok[3]);
                int fizetes=Integer.parseInt(adatok[4]);
                Dolgozo dolgozo=new Dolgozo(vezeteknev,keresztnev,nem,kor,fizetes);
                dolgozoklista.add(dolgozo);
                sor=br.readLine();
                System.out.println(sor);

            }
        reader.close();
            br.close();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    public void feladat3(){
        int dolgozokszama;
        dolgozokszama=dolgozoklista.size();
        System.out.println("Dolgozók száma: "+dolgozokszama);

    }
    public void feladat4(){
        int osszfizu=0;
        for ( Dolgozo f : dolgozoklista) {
            if (f.kor<25){
                osszfizu+=f.fizetes;
            }
        }
        System.out.println("25 év alattiak összfizetése: "+osszfizu+"Ft");

    }

    public void feladat5(){
        int legnagyobbfizu=0;
        String nev="";
        String nem="";
        int kor=0;

        for (Dolgozo f :dolgozoklista) {
            if (f.fizetes>legnagyobbfizu){
                legnagyobbfizu=f.fizetes;
                nev=f.vezeteknev+" "+f.keresztnev;
                nem=f.nem;
                kor=f.kor;
            }
        }
        System.out.println("A legnagyobb fizetésű dolgozó adatai: \n Neve:"+nev+"\n Neme:"+nem+"\n Kor:"+kor+"\n Fizetése:"+legnagyobbfizu);

    }
    public void feladat6(){
        int megadottosszeg=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Adjon meg egy összeget");
        megadottosszeg = Integer.parseInt(myObj.nextLine());
        boolean van=false;
        for (Dolgozo f:dolgozoklista) {
            if (f.fizetes<megadottosszeg){
                van=true;
            }
        }
        if (van==true){
            System.out.println("Van olyan dolgozó akinek a fizetése "+megadottosszeg+" Ft felett van");

        }else{
            System.out.println("nincsen ilyen doolgozó");
        }


    }
}
