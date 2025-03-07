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
        System.out.println("Choose the processor you want between Intel or AMD processors for your Dell computer ");
        processor=Caleb.nextLine();
        switch (processor) {
            case "Intel" -> {
                System.out.println("----------Intel Dell Computer----------");
                System.out.println("Brand:"+getBrand());
                System.out.println("Color:"+getColor());
                System.out.println("Model:"+getModel());
                System.out.println("Intel Core:i"+getIntel());
                System.out.println("Generation:"+getGeneration()+"th");
                System.out.println("Storage:"+getStorage()+"GB");
                System.out.println("Ram:"+getRam()+"GB");
                System.out.println("Operating System:"+getOS());
        }
            case "AMD" -> {
                System.out.println("----------AMD Dell Computer----------");
                System.out.println("Brand:"+getBrand());
                System.out.println("Color:"+getColor());
                System.out.println("Model:"+getModel());
                System.out.println("Rayzen"+getRayzen());
                System.out.println("Storage:"+getStorage()+"GB");
                System.out.println("Ram:"+getRam()+"GB");
                System.out.println("Operating System:"+getOS());
        }
            default -> System.out.println("Invalid processor choice. Please choose between Intel or AMD processors");
        }
    }
}