public class Boss extends Leader {
    @Override
    protected void handle(int money) {

        System.out.println("boss批复"+money+"元");
    }

    @Override
    protected int limit() {
        return 50000;
    }
}
