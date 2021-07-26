package Exercise_23;

import java.util.Scanner;

public class carTrouble {
    static Scanner Input = new Scanner(System.in);

    public static void main(String [] args) {
        carTrouble myCar = new carTrouble();
        String output;
        String silentCar = myCar.CarSilent();
        String corrodedTerminals;
        String slickingNoise;
        String crankUp;
        String engineStart;
        String fuelInjection;

        if (silentCar.equals("y")) {
            corrodedTerminals = myCar.batteryTerminals();
            output = myCar.corrodedTerminals(corrodedTerminals);
        }

        else {
            slickingNoise = myCar.slickingYesNo();

            if (slickingNoise.equals("y")) {
                output = myCar.slickingYes();
            }

            else {
                crankUp = myCar.doesCarCrank();

                if (crankUp.equals("y")) {
                    output = myCar.crankYes();
                }

                else {
                    engineStart = myCar.doesEngineStart();

                    if (engineStart.equals("y")) {
                        fuelInjection = myCar.hasFuelInjection();
                        output = myCar.fuelInjections(fuelInjection);
                    }

                    else {
                        output = myCar.engineStartNo();
                    }
                }
            }
        }

        myCar.printOutput(output);
    }

    public String CarSilent() {
        System.out.print("Is the car silent when you turn the key? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String batteryTerminals() {
        System.out.print("Are the battery terminals corroded? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String corrodedTerminals(String decision) {
        if (decision.equals("y")) {
            return "Clean terminals and try starting again.";
        } else {
            return "Replace cables and try again.";
        }
    }

    public String slickingYesNo() {
        System.out.print("Does the car make a slicking noise? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String slickingYes() {
        return "Replace the battery.";
    }

    public String doesCarCrank() {
        System.out.print("Does the car crank up but fail to start? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String crankYes() {
        return "Check spark plug connections.";
    }

    public String doesEngineStart() {
        System.out.print("Does the engine start and then die? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String hasFuelInjection() {
        System.out.print("Does you car have fuel injection? (Input: y/n) ");
        return Input.nextLine().toLowerCase();
    }

    public String fuelInjections(String fuel) {
        if (fuel.equals("y")) {
            return "Take it in for service.";
        } else {
            return "Check to ensure the choke is opening";
        }
    }

    public String engineStartNo() {
        return "This should not be possible. You have a magical car";
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
