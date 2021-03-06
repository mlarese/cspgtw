package org.saxt.cms.model;
// Generated Mar 3, 2018 2:20:56 PM by Hibernate Tools 3.6.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Item generated by hbm2java
 */
@Entity
@Table(name = "item", catalog = "cms")
public class Item implements java.io.Serializable {

	private Long id;
	private String name;
	private String description;
	private String type;
	private String text;
	private String link;
	private String image;
	private Date creationDate;
	private Date lastModifiedDate;
	private Set<ItemPageComponent> itemPageComponents = new HashSet<ItemPageComponent>(0);

	public Item() {
	}

	public Item(String name, String type, Date creationDate, Date lastModifiedDate) {
		this.name = name;
		this.type = type;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Item(String name, String description, String type, String text, String link, String image, Date creationDate,
			Date lastModifiedDate, Set<ItemPageComponent> itemPageComponents) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.text = text;
		this.link = link;
		this.image = image;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
		this.itemPageComponents = itemPageComponents;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "type", nullable = false, length = 6)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "text", length = 50)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "link", length = 50)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "image", length = 50)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified_date", nullable = false, length = 19)
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<ItemPageComponent> getItemPageComponents() {
		return this.itemPageComponents;
	}

	public void setItemPageComponents(Set<ItemPageComponent> itemPageComponents) {
		this.itemPageComponents = itemPageComponents;
	}

}
