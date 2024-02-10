package ap2.s1.model;

public class Billboard {
    double width;
    double height;
    boolean inUse;
    String brand;

    public Billboard(double w, double h, boolean iu, String b){
        this.width = w;
        this.height = h;
        this.inUse = iu;
        this.brand = b;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public boolean isInUse() {
        return inUse;
    }
    public String getBrand() {
        return brand;
    }
    public double calculateArea(double w, double h){
        return w*h;
    }
    public String toString() {
        String msg = "";
        msg += width + " | " + height + " | " + inUse + " | " + brand;
        return msg;
    }
}
