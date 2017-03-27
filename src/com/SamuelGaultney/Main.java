package com.SamuelGaultney;


class Car {
    private String name;
    private int cylinders;
    private int wheels = 4;
    private boolean engine = true;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine() {
        return("Failure to start");
    }

    public String accelerate() {
        return("Out of Gas");
    }

    public String brake() {
        return("Brake line severed, prepare to die");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

}

class HondaAcoord extends Car {
    public HondaAcoord() {
        super("Honda Accord", 4); //this fills in for the constructor, making the Car class the
        // car.honda class
    }
    @Override
    public String startEngine() {
        return "Engine Started, estimated 35 mpg";
    }

    @Override
    public String accelerate() {
        return("VROOOOOOOOOM");
    }
}


class MazdaMiata extends Car {
    public MazdaMiata() {
        super("Mazda Miata", 6);
    }
    @Override
    public String startEngine() {
        return "Engine Started: Sport Mode Activated";
    }

    @Override
    public String brake() {
        return "Disqualified for sucking";
    }
}

class Laferrari extends Car {
    public Laferrari() {
        super("LaFerrari", 12);
    }

    @Override
    public String brake() {
        return "Dismal Performance";
    }
}


public class Main {

    public static void main(String[] args) {
        for (int i=1; i<6; i++) {
            Car car = randomCar();
            System.out.println("This is car #" + i +
                    ": " + car.getName() + "\n" +
                    car.startEngine() + "\n" +
                    car.accelerate() + "\n" +
                    car.brake() + "\n"); //this is the polymorphism bit. movie.plot() calls the plot of the extend
            //of movie unless their is no plot() in that class
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random()*3) + 1; //returns random between zero and 1, ctrl click method for info
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new HondaAcoord(); //return serves as break

            case 2:
                return new MazdaMiata();

            case 3:
                return new Laferrari();
        }

        return null; //serves as default
    }
}
