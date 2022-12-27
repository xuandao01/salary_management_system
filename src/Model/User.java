package Model;

public class User extends Person{
    private int id;
    private String username;
    private float luongCung;
    private float thuong;
    private float phat;

    public double thuclinh(){
        return this.luongCung + this.thuong - this.phat;
    }

    public User() {
    }

    public User(String username, float luongCung, float thuong, float phat) {
        this.username = username;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public User(int id, String username, float luongCung, float thuong, float phat) {
        this.id = id;
        this.username = username;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public User(int id, String username, float luongCung, float thuong, float phat, String hoTen, int namSinh, String queQuan) {
        super(hoTen, namSinh, queQuan);
        this.id = id;
        this.username = username;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public float getThuong() {
        return thuong;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public float getPhat() {
        return phat;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }
    
    
}
