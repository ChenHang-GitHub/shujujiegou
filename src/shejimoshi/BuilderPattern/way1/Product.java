package shejimoshi.BuilderPattern.way1;

/**
 * @ClassName: Product
 * @author: csh
 * @date: 2019/11/3  16:13
 * @Description:   产品（Product）：描述一个由一系列部件组成较为复杂的对象。
 */
public class Product {
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;


    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }
}
