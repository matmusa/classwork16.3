public class Daughter extends Mother {

    private String hairColor;
    private int heighColor;

    public Daughter(String name, int age, String colorOfEye, String hairColor, int heighColor) {
        super(name, age, colorOfEye);
        this.hairColor = hairColor;
        this.heighColor = heighColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeighColor() {
        return heighColor;
    }

    public void setHeighColor(int heighColor) {
        this.heighColor = heighColor;
    }

    @Override
    public void Name() {
        System.out.println("this is doughter");
    }
}
