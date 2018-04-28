public class TvController implements PowerController, TVState {

    private TVState tvState;

    public TVState getTvState() {
        return tvState;
    }

    private void setTvState(TVState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {

        setTvState(new PowerOffState());
        System.out.println("关机了");
    }

    @Override
    public void nextChannel() {

        tvState.nextChannel();
    }

    @Override
    public void prevChannel() {

        tvState.prevChannel();
    }

    @Override
    public void turnUP() {

        tvState.turnUP();
    }

    @Override
    public void turnDown() {

        tvState.turnDown();
    }
}
