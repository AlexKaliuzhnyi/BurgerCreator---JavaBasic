package Lesson8;

public class Burger {
     private final String bun;
    /**
     * if <b>true</b> --> them number of meat = 2, else --> number of meat = 1
     */
    private final boolean isDoubleMeat;
    private final String green;
    private final  String cheese;
    private final String mayo;

    /**
     * @param bun type of bun
     * @param green type of grean
     * @param cheese type of meat
     * @param mayo type of mayo
     * @param numberOfMeat .User can choose number of meat with help of numberOfMeat param
     */
    public Burger(String bun, String green, String cheese, String mayo,boolean numberOfMeat) {
        this.bun = bun;
        this.green = green;
        this.cheese = cheese;
        this.mayo = mayo;
        this.isDoubleMeat = numberOfMeat;
        System.out.println(this);

    }
    public Burger(String bun, String green, String cheese, String mayo) {
        this(bun,green,cheese,mayo,false);
    }

    public Burger(String bun, String green, String cheese) {
        this(bun,green,cheese,null,false);
    }



    public String getBun() {
        return bun;
    }

    public String getGreen() {
        return green;
    }

    public String getCheese() {
        return cheese;
    }

    public String getMayo() {
        return mayo;
    }

    public boolean getNumberOfMeat() {
        return isDoubleMeat;
    }

    @Override
    public String toString() {
        String doubleMeat = isDoubleMeat ? "2": "1";
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", numberOfMeat=" + doubleMeat +
                ", green='" + green + '\'' +
                ", cheese='" + cheese + '\'' +
                ", mayo='" + mayo + '\'' +
                '}';
    }
}
