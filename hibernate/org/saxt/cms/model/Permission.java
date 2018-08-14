package org.saxt.cms.model;
// Generated Mar 3, 2018 2:20:56 PM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Permission generated by hbm2java
 */
@Entity
@Table(name = "permission", catalog = "cms")
public class Permission implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Set<Profile> profiles = new HashSet<Profile>(0);

	public Permission() {
	}

	public Permission(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Permission(String name, String description, Set<Profile> profiles) {
		this.name = name;
		this.description = description;
		this.profiles = profiles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", nullable = false, length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "profile_permission", catalog = "cms", joinColumns = {
			@JoinColumn(name = "permission_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "profile_id", nullable = false, updatable = false) })
	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

}
