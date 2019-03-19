package kr.hs.dgsw.web_3_19;

public class User {

    private String name;
    private String email;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return name + "/" + email;
    }

    public User(String name, String email, String id)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User()
    {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
