package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	
	
	private int  movie_id ;
	private String name;
	private String description;
	private String image;
	@Column(name ="create_at")
	private LocalDateTime  careate_date;
	private LocalDateTime release_date;
	@ManyToOne
	@JoinColumn(name="gender_id")
	private Gender gender_id;
	private String rating;
	
	
	public Movie () {
		
	}
	
	
	public Movie(int movie_id, String name, String description, String image, LocalDateTime careate_date,
			LocalDateTime release_date, Gender gender_id, String rating) {
		super();
		this.movie_id = movie_id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.careate_date = careate_date;
		this.release_date = release_date;
		this.gender_id = gender_id;
		this.rating = rating;
	}


	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public LocalDateTime getCareate_date() {
		return careate_date;
	}


	public void setCareate_date(LocalDateTime careate_date) {
		this.careate_date = careate_date;
	}


	public LocalDateTime getRelease_date() {
		return release_date;
	}


	public void setRelease_date(LocalDateTime release_date) {
		this.release_date = release_date;
	}


	public Gender getGender_id() {
		return gender_id;
	}


	public void setGender_id(Gender gender_id) {
		this.gender_id = gender_id;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	
	

}
