package com.challenge.ridesharer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.challenge.ridesharer.model.audit.DateAudit;

@Entity
@Table(name = "rides")
public class RideDetail extends DateAudit {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private Double sourceLat;

	@NotBlank
	private Double sourceLong;

	@NotBlank
	private Double destinationLat;

	@NotBlank
	private Double destinationLong;

	@NotBlank
	private Double fare;

	@NotBlank
	private Double distanceInKM;

	@NotBlank
	private Double rating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSourceLat() {
		return sourceLat;
	}

	public void setSourceLat(Double sourceLat) {
		this.sourceLat = sourceLat;
	}

	public Double getSourceLong() {
		return sourceLong;
	}

	public void setSourceLong(Double sourceLong) {
		this.sourceLong = sourceLong;
	}

	public Double getDestinationLat() {
		return destinationLat;
	}

	public void setDestinationLat(Double destinationLat) {
		this.destinationLat = destinationLat;
	}

	public Double getDestinationLong() {
		return destinationLong;
	}

	public void setDestinationLong(Double destinationLong) {
		this.destinationLong = destinationLong;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Double getDistanceInKM() {
		return distanceInKM;
	}

	public void setDistanceInKM(Double distanceInKM) {
		this.distanceInKM = distanceInKM;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

}
