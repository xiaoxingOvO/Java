package Java8新特性.java3;

/**
 * @author xiaoxing
 */
public class Boy {
    private Girl girl;

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Boy() {

    }

    public Boy(Girl girl) {

        this.girl = girl;
    }
}
