import javax.sound.midi.Soundbank;

public abstract class Leader {

    protected Leader nextHandler;//上一级领导处理者

    public final void handleRequest(int money){

        if (money < limit()){

            handle(money);
        }else {

            haveNo();
            if (null != nextHandler){

                nextHandler.handleRequest(money);
            }
        }
    }

    private void haveNo(){

        System.out.println("无权限");
    }

    /**
     * @param money 处理报账金额
     */
    protected abstract void handle(int money);

    protected abstract int limit();
}
