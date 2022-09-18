public class Griffindor extends Hogwarts {
    private int honor;
    private int nobility;
    private int bravery;

    public void compareStudents(Griffindor studentSecond) {
        int powerOne = this.honor + this.nobility + this.bravery;
        int powerTwo = studentSecond.honor + studentSecond.nobility + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " лучший Гриффиндорец, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " лучший Гриффиндорец, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Griffindor(String fullName, int magic, int teleport, int honor, int nobility, int bravery) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение Магии");
        }
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Неверное значение Трансгрессии");
        }
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Неверное значение Чести");
        }
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Неверное значение Благородства");
        }
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Неверное значение Храбрости");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setHonour(int honor) {
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return fullName + " - факультет Гриффиндор. Личные качества:\n" +
                "Магия - " + magic + "\n" +
                "Трансгрессия - " + teleport + "\n" +
                "Факультативные качества: \n" +
                "Благородство - " + nobility + "\n" +
                "Честь - " + honor + "\n" +
                "Храбрость - " + bravery + "\n";
    }
}
