
public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Run.");
            }
        };

        anonRun.run();

        Runnable lambdaRun = () -> System.out.println("Lambda Run!!!!");


        lambdaRun.run();
    }

}

