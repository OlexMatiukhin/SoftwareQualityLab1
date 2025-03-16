package refactoredcodeversion.main.Main;

public class Main {
    public static void main(String[] args) {
        HumanBodyMassIndex humanIMB = new HumanBodyMassIndex(80,1.52);

        System.out.println(humanIMB.getResult());
    }
}