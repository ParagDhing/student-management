package com.microservice.student.management.entity;

import java.util.List;

import com.microservice.student.management.dto.StudentDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	private int id;
	
	private String name;
	private int issuedBookCount;
	private List<String> issuedBooks;
	private long totalPayment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIssuedBookCount() {
		return issuedBookCount;
	}
	public void setIssuedBookCount(int issuedBookCount) {
		this.issuedBookCount = issuedBookCount;
	}
	public List<String> getIssuedBooks() {
		return issuedBooks;
	}
	public void setIssuedBooks(List<String> issuedBooks) {
		this.issuedBooks = issuedBooks;
	}
	public long getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(long totalPayment) {
		this.totalPayment = totalPayment;
	}
	public Student(int id, String name, int issuedBookCount, List<String> issuedBooks, long totalPayment) {
		super();
		this.id = id;
		this.name = name;
		this.issuedBookCount = issuedBookCount;
		this.issuedBooks = issuedBooks;
		this.totalPayment = totalPayment;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDTO mapToDto() {
		return new StudentDTO(name, issuedBookCount, issuedBooks, totalPayment);
	}
}
