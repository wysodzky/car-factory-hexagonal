package com.hexagonal.carfactory.domain.model;

public class Make {
    private final String value;

    private Make(final String value) {
        this.value = value;
    }

    public Make of(final String value) {
        return new Make(value);
    }

    public String value() {
        return value;
    }
}
