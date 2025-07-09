package com.threads.com;

class joinNalive {
    public  static void main(String[] args) {

        SampleThreads threadOne = new SampleThreads("Child #1");
        SampleThreads threadTwo = new SampleThreads("Child #2");
        SampleThreads threadThree = new SampleThreads("Child #3");


        /*do{
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main Thread is interrupted");
                throw new RuntimeException(e);
            }
        }while(threadOne.thread.isAlive() || threadTwo.thread.isAlive() || threadThree.thread.isAlive());
            System.out.println("Main thread Ending");
        */

}
static class SampleThreads implements Runnable {
    String myThread;
    Thread thread;

    @Override
    public void run() {
        System.out.println("Thread starts is: "+ myThread);
        for (int counter = 0; counter < 10; counter++) {
            try {
                Thread.sleep(200);
                System.out.println("Thread Running: " + myThread);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + myThread);
                throw new RuntimeException(e);
            }


        }

        System.out.println("thread ends is: "+ myThread);
    }

    public SampleThreads(String myThread) {
        this.myThread = myThread;
        thread = new Thread(this, myThread);
        thread.start();
    }
}}
