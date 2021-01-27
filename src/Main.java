import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ui dolgozo=new ui();

        System.out.println("3.feladat");
        dolgozo.feladat3();
        System.out.println("4.feladat");
        dolgozo.feladat4();
        System.out.println("5.feladat");
        dolgozo.feladat5();
        System.out.println("6.feladat");
        dolgozo.feladat6();
    }
}
