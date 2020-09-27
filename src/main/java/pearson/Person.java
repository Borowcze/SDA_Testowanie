package pearson;

class Person {

     String name;
     String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    String getFullName() {
        return name + " " + lastName;
    }
}

