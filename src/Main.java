public class Main {
    public static void main(String[] args) {

        Mother mother=new Mother("Maria  ",30,"bkack ");
        Mother mother1=new Mother("Elena ",36,"green ");
        Mother daughter=new Daughter("Masha  ",14,"black","Yellow",59);
        Daughter daughter1=new Daughter("Dasha  ",13,"Blue ","black",68);

        mother.Name();
        mother1.Name();
        daughter.Name();
        daughter1.Name();

     

    }
}