import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String engineModel = input[0];
            String enginePower = input[1];
            Engine engine = new Engine(engineModel,enginePower);
            engines.add(engine);
            if (input.length == 4) {
                String dip = input[2];
                String ef = input[3];
                engine.setDisplacement(dip);
                engine.setEfficiency(ef);
            }else if (input.length == 3){
                if (Character.isDigit(input[2].charAt(0))) {
                    String dip = input[2];
                    engine.setDisplacement(dip);
                }else {
                    String ef = input[2];
                    engine.setEfficiency(ef);
                }
            }

        }
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            String carEngine = input[1];
            Car car = new Car(carModel,null);
            Engine engine = null;
            for (Engine en: engines) {
                if (en.getModel().equals(carEngine)) {
                    car.setEngine(en);
                }
            }


            cars.add(car);


            if (input.length == 4){
                String weight = input[2];
                String color = input[3];
                car.setWeight(weight);
                car.setColor(color);
            } else if (input.length == 3) {
                if (Character.isDigit(input[2].charAt(0))) {
                    String weight = input[2];
                    car.setWeight(weight);
                }else {
                    String color = input[2];
                    car.setColor(color);
                }
            }

        }
        for (Car c: cars) {
            System.out.println(c.toString());
        }


    }

}
