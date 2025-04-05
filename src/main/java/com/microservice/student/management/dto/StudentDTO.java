package com.microservice.student.management.dto;

import java.util.List;

import com.microservice.student.management.entity.Student;

public class StudentDTO {

	private String name;
	private int issuedBookCount;
	private List<String> issuedBooks;
	private long totalPayment;
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDTO(String name, int issuedBookCount, List<String> issuedBooks, long totalPayment) {
		super();
		this.name = name;
		this.issuedBookCount = issuedBookCount;
		this.issuedBooks = issuedBooks;
		this.totalPayment = totalPayment;
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
	
	public Student mapToStudent() {
		return new Student(0, name, issuedBookCount, issuedBooks, totalPayment);
	}
}
