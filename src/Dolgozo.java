public class Dolgozo {
    String vezeteknev;
    String keresztnev;
    String nem;
    int kor;
    int fizetes;



    public Dolgozo(String vezeteknev, String keresztnev, String nem, int kor, int fizetes) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.nem = nem;
        this.kor = kor;
        this.fizetes = fizetes;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
}
