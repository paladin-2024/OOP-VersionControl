

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
        System.out.println("Brand:"+getBrand());
        System.out.println("Color:"+getColor());
        System.out.println("Model:"+getModel());
        System.out.println("Intel Core:i"+getIntel());
        System.out.println("Generation:"+getGeneration());
        System.out.println("Storage:"+getStorage());
        System.out.println("Ram:"+getRam());
        System.out.println("Operating System:"+getOS());
    }
    
    
    
}