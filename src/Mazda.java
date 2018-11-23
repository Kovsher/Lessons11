public class Mazda extends Car{
    public static final String COUNTRY = "Japan";
    private boolean isPraviyRul=true;

    public Mazda(String color, boolean isAutomat, int powerOfEngine, boolean isPraviyRul) throws InvalidCarParametersException {
        super(color, isAutomat, powerOfEngine);
        this.isPraviyRul = isPraviyRul;
    }

    public boolean isPraviyRul() {
        return isPraviyRul;
    }

    public void setPraviyRul(boolean isPraviyRul) {
        isPraviyRul = isPraviyRul;

    }

    public void move() {
        System.out.println("Mazda,isPraviyRul= "+isPraviyRul);

        System.out.println("....");
    }

}
