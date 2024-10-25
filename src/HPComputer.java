import java.util.Scanner;
public class HPComputer extends Computer {
    protected  int generation;
    protected String   processor;
    protected String model;
    protected int intel;
    protected int rayzen;
   
    public HPComputer(String Brand, String Color, int Storage, int Ram, String OS, int generation, String processor,
            String model,int intel,int rayzen,int battery) {
        super(Brand, Color, Storage, Ram, OS);
        this.generation = generation;
        this.processor = processor;
        this.model = model;
        this.intel=intel;
        this.rayzen=rayzen;
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
        System.out.println("Choose the processor you want between Intel or AMD processors");
        processor=Caleb.nextLine();
        switch (processor) {
            case "Intel" -> {
                System.out.println("----------Intel Hp Computer----------");
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
                System.out.println("----------AMD Hp Computer----------");
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
    public void HPbattery(){
        Scanner Caleb=new Scanner(System.in);
        System.out.println("What is the type of your computer? is it Gaming, programming, or business");
        String type=Caleb.nextLine();
        if("Gaming".equals(type)){
            System.out.println("The battery is above 15 hours");
        }
        else if("Programming".equals(type)){
            System.out.println("The battery is above 9 hours");
        }
        else if("Business".equals(type)){
            System.out.println("The battery is below 8 hours");
        }
        else{
            System.out.println(" if Your battery it's below 2 hours you must change it");
        }
    }
}
