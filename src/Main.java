public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 99, 89, 95, 91, 84);
        Griffindor germionaGranger = new Griffindor("Гермиона Грейнджер", 85, 76, 85, 45, 37);
        Griffindor ronWizly = new Griffindor("Рон Уизли", 46, 82, 57, 43, 56);
        Slizerin drakoMalfoy = new Slizerin("Драко Малфой", 46, 87, 51, 27, 94, 19, 73);
        Slizerin grahamMontegu = new Slizerin("Грэхэм Монтегю", 67, 56, 41, 82, 74, 96, 59);
        Slizerin gregoryHoil = new Slizerin("Грегори Гойл", 79, 85, 94, 16, 5, 80, 65);
        Puffenduy zahariaSmith = new Puffenduy("Захария Смит", 71, 61, 59, 43, 77);
        Puffenduy sedrikDiggory = new Puffenduy("Седрик Диггори", 19, 70, 64, 59, 33);
        Puffenduy justinFinchFletchly = new Puffenduy("Джастин Финч-Флетчли", 68, 96, 13, 48, 54);
        Kogtevran chjouChang = new Kogtevran("Чжоу Чанг", 58, 36, 94, 18, 48, 55);
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", 88, 45, 57, 24, 65, 49);
        Kogtevran marcusBelbi = new Kogtevran("Маркус Белби", 16, 5, 52, 57, 85, 43);

        harryPotter.compareStudents(ronWizly);
        ronWizly.compareStudents(germionaGranger);

        Hogwarts.compareStudents(drakoMalfoy,marcusBelbi);
        Hogwarts.compareStudents(gregoryHoil,chjouChang);

        System.out.println();
        System.out.println(justinFinchFletchly);
    }
}