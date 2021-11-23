package com.geekbrains.patterns.structures.adapter;

public class BigInterfaceAdapter implements BigInterface {

    private final BigInterface bigInterface;

    public BigInterfaceAdapter() {
        this.bigInterface = new StubBigInterface();
    }

    public BigInterfaceAdapter(BigInterface bigInterface) {
        this.bigInterface = bigInterface;
    }

    @Override
    public void f1() {
        bigInterface.f1();
    }

    @Override
    public void f2() {
        bigInterface.f2();
    }

    @Override
    public void f3() {
        bigInterface.f3();
    }

    @Override
    public void f4() {
        bigInterface.f4();
    }
}
