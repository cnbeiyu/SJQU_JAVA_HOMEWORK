import java.math.BigDecimal;

/**
 * Created by 贝鱼 on 2019/4/1.
 */
class JavaCourse{
    static final double TR = 0.3;
    static final double RR = 0.3;
    static final double ER = 0.4;

    private String name;
    private int id;
    private int testScore;
    private int dailySocre;
    private int finalSocre;
    private double sumScore;

    public void printAll(){
        this.calSumscore();
        System.out.println(this.name+"的学号是"+this.id+"测试成绩是"+this.testScore+",平时成绩是"+this.dailySocre+",期末成绩是"+this.finalSocre+",总成绩是"+this.sumScore);
    }

    public void calSumscore() {
        this.sumScore=new BigDecimal(this.testScore*TR + this.dailySocre*RR + finalSocre*ER).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public int getDailySocre() {
        return dailySocre;
    }

    public void setDailySocre(int dailySocre) {
        this.dailySocre = dailySocre;
    }

    public int getFinalSocre() {
        return finalSocre;
    }

    public void setFinalSocre(int finalSocre) {
        this.finalSocre = finalSocre;
    }

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }
}