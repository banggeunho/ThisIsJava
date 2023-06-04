package designpattern.creational.builder;

class Person {
    private String name;
    private String age;
    private String gender;
    private String job;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.job = builder.job;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.gender + " " + this.job;
    }

    public static class Builder {


        private String name;
        private String age;
        private String gender;
        private String job;

        public Builder() {}

        public Builder builder() {
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
