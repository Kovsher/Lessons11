public abstract class Car {
    public static final int NUMBER_OF_WHEELS = 4;
    private String color;//nule
    private boolean isAutomat;//false
    private int powerOfEngine;//0


    public Car(String color, boolean isAutomat, int powerOfEngine) //сигнатура метода
            throws InvalidCarParametersException {
        if (color == null || color.isEmpty()) {
            throw new InvalidCarParametersException("color can't be empty String");

        }
        if (powerOfEngine < 0 || powerOfEngine > 1000) {
            throw new InvalidCarParametersException("power must be from 0 to 1000");
        }
        this.color = color;
        this.isAutomat = isAutomat;
        this.powerOfEngine = powerOfEngine;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("color can't be empty String");
            return;
        }
        this.color = color;
    }

    public boolean isAutomat() {
        return isAutomat;
    }

    public void setAutomat(boolean automat) {
        isAutomat = automat;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        if (powerOfEngine < 0 || powerOfEngine > 1000)
            System.out.println("power must be from 0 to 1000");
        this.powerOfEngine = powerOfEngine;
    }

//    public abstract void move(    );




}
