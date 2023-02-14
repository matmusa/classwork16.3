public class Mother {
    private String name;
    private int age;
    private String colorOfEye;

    public Mother(String name, int age, String colorOfEye) {
        this.name = name;
        this.age = age;
        this.colorOfEye = colorOfEye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorOfEye() {
        return colorOfEye;
    }

    public void setColorOfEye(String colorOfEye) {
        this.colorOfEye = colorOfEye;
    }

    public void Name() {
        System.out.println( name+"this a mother");

    }
}
