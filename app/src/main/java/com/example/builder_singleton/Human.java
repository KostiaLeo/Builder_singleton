package com.example.builder_singleton;

public class Human {
    private final String name;
    private final int yearOfBirth;
    private final int hairColor;
    private final int growth;
    private final int weight;
    private final boolean children;

    public class Builder{
        private final String name;
        private final int yearOfBirth;

        private int hairColor = 0;
        private int growth = 0;
        private int weight = 0;
        private boolean children = false;


        public Builder(String name, int yearOfBirth) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }

        public Builder hairColor(int val){
            hairColor = val;
            return this;
        }
        public Builder growth(int val){
            growth = val;
            return this;
        }
        public Builder weight(int val){
            weight = val;
            return this;
        }
        public Builder children(boolean val){
            children = val;
            return this;
        }
        public Human build(){
            return new Human(this);
        }
    }

    private Human(Builder builder) {
        this.name = builder.name;
        this.yearOfBirth = builder.yearOfBirth;
        this.hairColor = builder.hairColor;
        this.growth = builder.growth;
        this.weight = builder.weight;
        this.children = builder.children;
    }
}
