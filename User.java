package Laboratorka1;

record User(String firstName, String lastName, String age, String email){
    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;

        return firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                age.equals(user.age) &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }
}