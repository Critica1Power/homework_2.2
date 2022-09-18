public class Kogtevran extends Hogwarts {
    final String fullName;
    final int magic;
    final int teleport;
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public void compareStudents(Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " лучший Когтевранец, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " лучший Когтевранец, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setMind(int mind) {
        if (mind < 0 || mind > 100) {
            throw new RuntimeException("Неверное значение Ума");
        }
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение Мудрости");
        }
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение Остроумия");
        }
        this.wit = wit;
    }

    public void setCreation(int creation) {
        if (creation < 0 || creation > 100) {
            throw new RuntimeException("Неверное значение Творчества");
        }
        this.creation = creation;
    }

    public Kogtevran(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        super(fullName, magic, teleport);
        if (mind < 0 || mind > 100) {
            throw new RuntimeException("Неверное значение Ума");
        }
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение Мудрости");
        }
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение Остроумия");
        }
        if (creation < 0 || creation > 100) {
            throw new RuntimeException("Неверное значение Творчества");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return fullName + " - факультет Когтевран. Личные качества:\n" +
                "Магия - " + magic + "\n" +
                "Трансгрессия - " + teleport + "\n" +
                "Факультативные качества: \n" +
                "Ум - " + mind + "\n" +
                "Мудрость - " + wisdom + "\n" +
                "Остроумие - " + wit + "\n" +
                "Творчество - " + creation + "\n";
    }
}
