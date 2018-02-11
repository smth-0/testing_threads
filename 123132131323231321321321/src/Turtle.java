/**
 * Created in 11.02.18. package PACKAGE_NAME.
 * in project 123132131323231321321321.
 */
public class Turtle extends Thread {
    int steps=0;
    int speed=0;
    int distance=0;
    int sleepTime=0;
    String name="";
    int sleepDistance=0;
    Turtle(int distance, int speed, int sleepTime, String name, int sleepDistance){
        this.distance=distance;
        this.steps=speed;
        this.sleepTime=sleepTime*1000;
        this.name=name;
        this.sleepDistance=sleepDistance;
    }

    @Override
    public void run() {
        for(int i=0;i<distance;++i) {

            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
            steps += speed;
            if(i%sleepDistance==0){
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                }
            }
            System.out.println("steep for turtle "+name);
        }
        System.out.print("I'm finished! My number is ");
        System.out.println(name);
        Main.v.add(this);
    }

}
