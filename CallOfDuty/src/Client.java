public class Client {

    public  static  void main(String[] args){

        CallOfDuty callOfDuty = new CallOfDuty();
        callOfDuty.play();

        Carretaker carretaker = new Carretaker();
        carretaker.archive(callOfDuty.createMemoto());
        callOfDuty.quit();

        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore(carretaker.getmMemoto());
    }
}
