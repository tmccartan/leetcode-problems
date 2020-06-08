package threads;

public class Playground {

    class Talker implements Runnable {

        private String name;

        Talker(String name) {
            this.name = name;

        }
        @Override
        public void run() {
            try{
                System.out.println(name + "says hi");
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                System.out.println(ex.toString());
            }

        }
    }

    public void run(){
        Thread t1 = new Thread(new Talker("terry"));
        Thread t2 = new Thread(new Talker("terry"));
        Thread t3 = new Thread(new Talker("terry"));

        t1.start();
        t2.start();
        t3.start();

    }
    public static void main(String [] args){

        Playground p1 = new Playground();
        p1.run();


    }
}
