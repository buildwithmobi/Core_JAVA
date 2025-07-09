package com.threads.com;

class threads {
    public static void main(String[] args) {
        // constructing myThread object
        myThreads childOne = new myThreads("Child #1");
        myThreads childTwo = new myThreads("Child #2");
        myThreads childThree = new myThreads("Child #3");

        childOne.thread.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Child #1 Priority is "+ childOne.thread.getPriority());

        childTwo.thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child #2 Priority is "+ childTwo.thread.getPriority());

        childThree.thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Child #3 Priority is "+ childThree.thread.getPriority());


    }


}
class myThreads implements Runnable {
    Thread thread;
    String myThread;
    @Override
    public void run() {
        System.out.println("Thread starting is: "+ thread);
        for (int count = 0 ; count<10; count++){
            try {
                Thread.sleep(300);
                System.out.println("Thread currently running is: "+ thread + " count is: "+ count);
            } catch (InterruptedException e) {
                System.out.println("Problem with Thread : "+ thread);
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread terminated : " + thread );

    }
    public myThreads(String myThread){
        this.myThread = myThread;
        thread = new Thread(this, myThread);
        thread.start();
    }

}
