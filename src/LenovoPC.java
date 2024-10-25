

public class LenovoPC extends Computer {
    protected  int generation;
    protected String   processor;
    protected String model;
    protected int intel;
    protected int battery;
    public LenovoPC(String Brand, String Color, int Storage, int Ram, String OS, int generation, String processor,
            String model, int intel, int rayzen) {
        super(Brand, Color, Storage, Ram, OS);
        this.generation = generation;
        this.processor = processor;
        this.model = model;
        this.intel = intel;
    }

    public int getGeneration() {
        return generation;
    }

    public String getProcessor() {
        return processor;
    }

    public String getModel() {
        return model;
    }
    public int getIntel() {
        return intel;
    }
    @Override
    public void ComputerSpecs() {
        System.out.println("----------Intel Lenovo Computer----------");
        System.out.println("Brand:"+getBrand());
        System.out.println("Color:"+getColor());
        System.out.println("Model:"+getModel());
        System.out.println("Intel Core:i"+getIntel());
        System.out.println("Generation:"+getGeneration()+"th");
        System.out.println("Storage:"+getStorage()+"GB");
        System.out.println("Ram:"+getRam()+"GB");
        System.out.println("Operating System:"+getOS());
    }
    
    
    
}