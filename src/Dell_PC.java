import java.util.Scanner;

public class Dell_PC extends Computer {
    protected  int generation;
    protected String   processor;
    protected String model;
    protected int intel;
    protected int rayzen;
    public Dell_PC(String Brand, String Color, int Storage, int Ram, String OS, int generation, String processor,
            String model, int intel, int rayzen) {
        super(Brand, Color, Storage, Ram, OS);
        this.generation = generation;
        this.processor = processor;
        this.model = model;
        this.intel = intel;
        this.rayzen = rayzen;
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
    public int getRayzen() {
        return rayzen;
    }
        @Override
    public void ComputerSpecs() {
    Scanner Caleb=new Scanner(System.in);
        System.out.println("Cgoose the processor you want between Intel or AMD processors");
        processor=Caleb.nextLine();
        if("Intel".equals(processor)){
            System.out.println("Brand:"+getBrand());
            System.out.println("Color:"+getColor());
            System.out.println("Model:"+getModel());
            System.out.println("Intel Core:i"+getIntel());
            System.out.println("Generation:"+getGeneration());
            System.out.println("Storage:"+getStorage());
            System.out.println("Ram:"+getRam());
            System.out.println("Operating System:"+getOS());
        }
        else if("AMD".equals(processor)){
            System.out.println("Brand:"+getBrand());
            System.out.println("Color:"+getColor());
            System.out.println("Model:"+getModel());
            System.out.println("Rayzen"+getRayzen());
            System.out.println("Storage:"+getStorage());
            System.out.println("Ram:"+getRam());
            System.out.println("Operating System:"+getOS());
        }
        else{
            System.out.println("Invalid processor choice. Please choose between Intel or AMD processors");
        }
    }
}