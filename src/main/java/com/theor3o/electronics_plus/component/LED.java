package com.theor3o.electronics_plus.component;

public class LED extends ElectronicComponent {
    public LED() {
        voltageRequired = 3;
    }

    @Override
    public void update() {
        powered = voltage == voltageRequired;
    }

}