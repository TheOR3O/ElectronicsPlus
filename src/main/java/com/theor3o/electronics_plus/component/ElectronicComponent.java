package com.theor3o.electronics_plus.component;

public abstract class ElectronicComponent {
    public int voltage = 0;
    public int voltageRequired = 0;

    public boolean powered = false;

    public abstract void update();
}