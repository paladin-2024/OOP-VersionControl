import java.util.List;
public class Polymorphism {
    public void InstanceMethod(List<Computer>Brand){
        for(Computer computer : Brand){
            computer.ComputerSpecs();
            
        }
    }
}