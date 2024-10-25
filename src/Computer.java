public abstract  class Computer {
    protected String Brand;
    protected String Color;
    protected int Storage;
    protected int Ram;
    protected String OS;

    public Computer(String Brand, String Color, int Storage, int Ram, String OS) {
        this.Brand = Brand;
        this.Color = Color;
        this.Storage = Storage;
        this.Ram = Ram;
        this.OS = OS;
    }
    
    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return Color;
    }

    public int getStorage() {
        return Storage;
    }

    public int getRam() {
        return Ram;
    }

    public String getOS() {
        return OS;
    }

    public abstract void ComputerSpecs();

}