package com.example.demo.Entities;

public class Student {
	public Long id;
	public String name;
	public int score;
	
	public Student(Long id, String name, int score)
	{
		this.id=id;
		this.name=name;
		this.score=score;
	}

	public Long getId()
	{
		return id;
	}

	public int getScore() {
		
		return score;
	}

	public void setScore(int newScore) {
		this.score=newScore;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Student details are " +"id:" + id + ", name:" + name + ", score=" + score;
	}

	

	

}
