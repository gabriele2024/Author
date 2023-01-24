public class Author {
    String name;
    String email;
    String gender;

    public Author(String N, String E, String G) {

        this.name = N;
        this.email = E;
        this.gender = G;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public void getGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        if (this.gender.equals("Male")) {
            return " The name of the author is " + name +
                    " his email address is " + email +
                    " and he is a " + gender;

        } else {
            return " The name of the author is " + name +
                    " his email address is " + email +
                    " and she is a " + gender;
        }
    }
}
