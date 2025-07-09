package com.threads.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread Starting");

        //construct myThread object
        myThread mt  = new myThread("child #1");

        // construct actual thread from previous object
        Thread newThread = new Thread(mt);
        newThread.start();
    }
}

class myThread implements Runnable{
    String myThread;

    @Override
    public void run() {
        System.out.println(myThread + " Starting");
        for (int count = 0; count<10;count++){
            try {
                Thread.sleep(400);
                System.out.println("In "+ myThread+ " count is: "+ count);
            } catch (InterruptedException e) {
                System.out.println(myThread+ " interrupted");
                throw new RuntimeException(e);
            }
        }
        System.out.println(myThread+ " terminated");
    }
    public  myThread(String myThread){
        this.myThread = myThread;
    }

}