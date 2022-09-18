public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resoursefulness;
    private int lustForPower;

    public void compareStudents(Slizerin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resoursefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + studentSecond.resoursefulness + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " лучший Слизеринец, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " лучший Слизеринец, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Slizerin(String fullName, int magic, int teleport, int cunning, int determination, int ambition, int resoursefulness, int lustForPower) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение Магии");
        }
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Неверное значение Трансгрессии");
        }
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Неверное значение Хитрости");
        }
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Неверное значение Решительности");
        }
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Неверное значение Амбициозности");
        }
        if (resoursefulness < 0 || resoursefulness > 100) {
            throw new RuntimeException("Неверное значение Находчивости");
        }
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Неверное значение Жажды власти");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resoursefulness = resoursefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefulness() {
        return resoursefulness;
    }

    public void setResoursefulness(int resoursefulness) {
        this.resoursefulness = resoursefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return fullName + " - факультет Слизерин. Личные качества:\n" +
                "Магия - " + magic + "\n" +
                "Трансгрессия - " + teleport + "\n" +
                "Факультативные качества: \n" +
                "Хитрость - " + cunning + "\n" +
                "Решительность - " + determination + "\n" +
                "Амбициозность - " + ambition + "\n" +
                "Находчивость - " + resoursefulness + "\n" +
                "Жажда власти - " + lustForPower + "\n";
    }
}
