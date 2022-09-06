package practice;

public class ThreadDemoMain {

    public static void main(String args[]) {

        //1. first way of thread implementation
        Runnable r1 = () -> {
            System.out.println("Thread 1");
            for (int i = 1; i < 11; i++) {
                System.out.println("i;" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread T1 = new Thread(r1);
        T1.setName("Appu");
        T1.start();

        //2. 2nd way of implementing thread

        Runnable r2 = ()->{
           try {
               for (int j = 1; j <= 10; j++) {
                   System.out.println("table of 2:" + j * 2);

                       Thread.sleep(1000);

               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        };
        Thread T2 = new Thread(r2);
        T2.setName("Appppppp");
        T2.start();
    }

}