package com.theor3o.electronics_plus.component;

public abstract class ElectronicComponent {
    public int voltageInput = 0;
    public int voltageRequired = 0;

    public int voltageOutput = 0;

    public boolean powered = false;

    public abstract void update();
}