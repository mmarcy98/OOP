package fourthPracticeHuman.bekelabs;

public class Human {
    private String name;
    private double weight;
    private double height;

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTTI() {
        return this.weight/(this.height * this.height);
    }

    public String getDetails(double tti) {
        if (tti <= 18.5){
            return "Skinny";

        }
        else if (tti >=25.0){
            return "Fat";
        }
        else{
            return "Normal";
        }
    }
    public String getData() {
    return "Name: "+this.name +"Weight :" +this.weight +"Height: " + this.height +"TTI:" +getTTI() + "Shape: "+
            getDetails(getTTI());
    }
}

