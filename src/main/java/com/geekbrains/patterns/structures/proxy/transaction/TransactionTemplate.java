package com.geekbrains.patterns.structures.proxy.transaction;

import java.util.concurrent.Callable;

public class TransactionTemplate {

    public <T> T doActionInTransaction(Callable<T> callable) throws Exception {
        // transactional sql logic
        return callable.call();
    }

}
