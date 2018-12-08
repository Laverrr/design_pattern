package com.laver.design.pattren.structural.facade;

/**
 * Created by geely
 */
public class Computer {
    private CPU cpu;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.disk = new Disk();
    }
    public void open(){
        this.cpu.open();
        this.disk.open();
    }
    public void close(){
        this.cpu.close();
        this.disk.close();
    }

}
