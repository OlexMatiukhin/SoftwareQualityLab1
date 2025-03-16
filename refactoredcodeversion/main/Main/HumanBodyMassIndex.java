package refactoredcodeversion.main.Main;

public class HumanBodyMassIndex {

    public double weight;
    public double height;
    private double humanBodyMassIndex;
    
    public HumanBodyMassIndex(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getHumanBodyMassIndex() {
        return weight/(height*height);
    }
    
    public  String getResult() {
        String resultString = "";
        if (getHumanBodyMassIndex() >= 18.5 & getHumanBodyMassIndex() < 25) {
            return "Norm";
        } else if (getHumanBodyMassIndex() >= 25 & getHumanBodyMassIndex() < 30) {
            return "Warning! ";
        } else if (getHumanBodyMassIndex() >= 30) {
            resultString = "Fat";
        }
        return resultString = "Deficit";
    }


}


