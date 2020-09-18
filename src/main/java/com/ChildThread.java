package com;

public class ChildThread extends Thread {

    @Override
    public void run(){
        System.out.println("Running thread " + this.getId());
    }


}
