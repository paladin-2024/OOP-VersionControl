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
        System.out.println("Cgoose the processor you want between Intel or AMD processors");
        processor=Caleb.nextLine();
        if("Intel".equals(processor)){
            System.out.println("----------Intel Hp Computer----------");
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
            System.out.println("----------AMD Hp Computer----------");
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
    public void HPbattery(){
        Scanner Caleb=new Scanner(System.in);
        System.out.println("What is the type of your computer? is it Gaming, programming, or business");
        String type=Caleb.nextLine();
        if(type=="Gaming"){
            System.out.println("The battery is above 15 hours");
        }
        else if(type=="Programming"){
            System.out.println("The battery is above 9 hours");
        }
        else if(type=="Business"){
            System.out.println("The battery is below 8 hours");
        }
    }
}
