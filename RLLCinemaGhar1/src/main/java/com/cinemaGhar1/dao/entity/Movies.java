package com.cinemaGhar1.dao.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	//@NotNull
	private Long id;
	
	@Column(name="MOVIE_TITLE")
	private String title;
	
	@Column(name="MOVIE_R_DTE")
	private String date;
	
	@Column(name="MOV_STATUS")
	private String status;

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(Long id, String title, String date, String status) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", date=" + date + ", status=" + status + "]";
	}
	
	
}