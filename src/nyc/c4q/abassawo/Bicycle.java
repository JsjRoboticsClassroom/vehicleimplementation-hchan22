package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class Bicycle implements Vehicle, {
    int speed;

    public Bicycle(){
        this.speed = 0;
    }


    @Override
    public void applyBrake(int speed,int brake){
        speed = speed - brake;

    }
    @Override
    public void speedUp(int speed, int gas){
        speed = speed + gas;
    }

    @Override
    public void slowDown(int slow){
        applyBrake(slow);

    }



//    @Override
//    public boolean popAWheelie(int duration) {
//        while(duration != 0){
//            System.out.println("I'm poppping a wheeeelieeee");
//            duration--;
//        }
//        return true;
//    }
}
