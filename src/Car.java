import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model,Engine engine){

        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void setEngine(Engine engine){

        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
    public String getModel(){
        return this.model;

    }
    public String getWeight(){
        return this.weight;
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){

        Engine en = this.getEngine();
        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s"
                ,this.model,en.getModel(),en.getPower(),en.getDisplacement()
                ,en.getEfficiency(),this.weight,this.color);
    }


}
