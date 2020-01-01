public class Engine {

    private String model;
    private String power;
    private String displacement ;
    private String efficiency;

    public Engine(String model, String power ){
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getPower(){
        return this.power;
    }
    public void setPower(){
        this.model = model;
    }
    public String getDisplacement(){
        return this.displacement;
    }
    public void setDisplacement(String displacement){
        this.displacement = displacement;
    }
    public String getEfficiency(){
        return this.efficiency;
    }
    public void setEfficiency(String efficiency){
        this.efficiency = efficiency;
    }
}
