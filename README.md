# JavaOOP
public class RuangKelas {
    private int panjang;
    private int lebar;
    private int jumlahpintu;
    private int jumlahjendela;
    private int jumlahkursi;
    double hitungluas(){                              //int hitungluas(){
        //int luas = panjang*lebar;      
        return panjang*lebar;//return panjang*lebar; mengembalikan luas
        //System.out.println("Luas"+luas);            //}
    }
    double hitungRasioLuas(){                         // double hitungRasioLuas(){
        //double luas = panjang*lebar;                   //return hitungLuas/jumlahkursi;
        return hitungluas()/jumlahkursi;
        //double rasio = luas/jumlahkursi;             //}
        //System.out.println("Rasio Luas"+rasio);     
    }
    public int getPanjang(){
        return panjang;
        
    }
    public void setPanjang(int newPanjang){
        panjang = newPanjang;
    }
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int newLebar){
        lebar = newLebar;
    }
    public int getJumlahjendela(){
        return jumlahjendela;
    }
    public void setJumlahjendela(int newJumlahjendela){
        jumlahjendela = newJumlahjendela;
    }
    public int getJumlahpintu(){
        return jumlahpintu;
    }
    public void setJumlahpintu(int newJumlahpintu){
        jumlahpintu = newJumlahpintu;
    }
    public int getJumlahkursi(){
        return jumlahkursi;
    }
    public void setJumlahkursi(int newJumlahkursi){
        jumlahkursi = newJumlahkursi;
    }
}
