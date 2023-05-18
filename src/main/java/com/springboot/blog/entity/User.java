package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, String username, String email, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	private String name;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles;

    /* - - - - - - - - - - - - - - - - - - - - - - - - - */
	
	// Use Getters & Setters to ( ID, Name, Username, Email, Password, Roles )
	
	/* - - - - - - - - - - - - - - - - - - - - - - - - - */
    
    
	/* - - - - - - - - - - - - - - Getters & Setters ( ID ) - - - - - - - - - - - - - - - - */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/* - - - - - - - - - - - - - - Getters & Setters ( Name ) - - - - - - - - - - - - - - - */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* - - - - - - - - - - - - - Getters & Setters ( Username ) - - - - - - - - - - - - - - */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	/* - - - - - - - - - - - - - Getters & Setters ( Email ) - - - - - - - - - - - - - - - */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/* - - - - - - - - - - - - - Getters & Setters ( Password ) - - - - - - - - - - - - - */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/* - - - - - - - - - - - - - Getters & Setters ( Roles ) - - - - - - - - - - - - - - */
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
		
	/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
	}
}