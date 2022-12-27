package Model;


public abstract class Person {
    private String hoTen;
    private int namSinh;
    private String queQuan;

    public Person() {
    }

    public Person(String hoTen, int namSinh, String queQuan) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
}
