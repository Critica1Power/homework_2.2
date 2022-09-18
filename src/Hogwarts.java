public abstract class Hogwarts {

    private String fullName;
    private int magic;
    private int teleport;

    public Hogwarts(String fullName, int magic, int teleport) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }


    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond) {
        int powerOne = studentFirst.magic + studentFirst.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(studentFirst.fullName + " обладает большей мощностью магии, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " обладает большей мощностью магии, чем " + studentFirst.fullName);
        } else {
            System.out.println(studentFirst.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение Магии");
        }
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Неверное значение Трансгрессии");
        }
        this.teleport = teleport;
    }
}
