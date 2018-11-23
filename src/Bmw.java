public class Bmw extends Car {
    public static final String COUNTRY = "Germany";
    private int numberOfSpoilers;

    public Bmw(String color, boolean isAutomat, int powerOfEngine, int numberOfSpoilers)
        throws InvalidCarParametersException{
        super(color,isAutomat,powerOfEngine);
        if (numberOfSpoilers<0||numberOfSpoilers>10){
            throw new InvalidCarParametersException("color can't be empty String");
        }

    }

    public void move() {
        System.out.println("Bmw move");


    }



    }






