package PBOAHMADRIDAI;

//class
public class Mahasiswa {
    //atribut dan encapsulation
    private String nama;
    private String npm;

    //constructor
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    //mutator(setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }
    
    public String displayInpo(){
        return "Nama: "+getNama()+"\nNPM: "+getNpm();
    }    
    
}