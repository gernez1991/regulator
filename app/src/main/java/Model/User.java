package Model;



import java.util.Objects;

import static java.util.Objects.hash;

//data class User()
    public class User{

        private String fullname;
        private String username;
        private String email;
        private String password;

    public User( String fullname, String username, String email, String password) {

        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.password = password;
    }



    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return fullname == user.fullname &&
                username == user.username && email == user.email && password == user.password;
    }



}


