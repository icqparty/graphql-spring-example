package ru.icqparty.apifirebody.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "users")
public class User{


    @Id
    private String id;
    private String password;

    @Indexed(unique = true)
    private String username;
    private Integer enable;
    private Integer lock;
    private List<Role> roles;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    //    private List<Company> companies;

    public User() {
    }

    public User(String id, String password, String username, Integer enable, Integer lock, List<Role> roles) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.enable = enable;
        this.lock = lock;
        this.roles = roles;
    }




    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUsername() {

        return this.username;
    }




    public void setUsername(String username) {
        this.username = username;
    }


    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer isLock() {
        return lock;
    }

    public void setLock(Integer lock) {
        this.lock = lock;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", enable=" + enable +
                ", lock=" + lock +
                ", roles=" + roles +
                '}';
    }
}
