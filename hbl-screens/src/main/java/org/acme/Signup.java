package org.acme;


import javax.persistence.*;

@Entity
public class Signup {
    public Signup(){}

    public Signup(String user_name, String email, int branch_code) {
        this.user_name = user_name;
        this.email = email;
        this.branch_code = branch_code;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String user_name;
    @Column(length = 40)
    private String email;
    @Column
    private int branch_code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(int branch_code) {
        this.branch_code = branch_code;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", branch_code=" + branch_code +
                '}';
    }
}
