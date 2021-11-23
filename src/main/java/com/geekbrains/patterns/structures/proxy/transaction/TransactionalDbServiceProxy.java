package com.geekbrains.patterns.structures.proxy.transaction;

import java.util.List;

public class TransactionalDbServiceProxy extends DbService {

    private final TransactionTemplate template;

    public TransactionalDbServiceProxy(TransactionTemplate template) {
        this.template = template;
    }

    @Override
    public List<String> getUsers() {
        try {
            return template.doActionInTransaction(super::getUsers);
        } catch (Exception e) {
            throw new RuntimeException("Transaction was broken");
        }
    }
}
