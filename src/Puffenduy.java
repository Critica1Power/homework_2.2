public class Puffenduy extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public void compareStudents(Puffenduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " лучший Пуффендуец, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " лучший Пуффендуец, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Puffenduy(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение Магии");
        }
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Неверное значение Трансгрессии");
        }
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Неверное значение Трудолюбия");
        }
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение Верности");
        }
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Неверное значение Честности");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return fullName + " - факультет Пуффендуй. Личные качества:\n" +
                "Магия - " + magic + "\n" +
                "Трансгрессия - " + teleport + "\n" +
                "Факультативные качества: \n" +
                "Трудолюбие - " + industriousness + "\n" +
                "Верность - " + loyalty + "\n" +
                "Честность - " + honesty + "\n";
    }
}
