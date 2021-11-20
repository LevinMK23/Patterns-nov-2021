package com.geekbrains.patterns.creators.builder;


public class User {

    private final String name, surname, phone, address;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name, surname, phone, address;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
