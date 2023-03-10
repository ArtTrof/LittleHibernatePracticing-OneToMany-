package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="year_of_production")
    private int yearOfProduction;

    @ManyToOne
    @JoinColumn(name="director_id",referencedColumnName = "director_id")
    private Director creator;

    public Movie(){}

    public Movie(String name, int yearOfProduction, Director creator) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.creator = creator;
    }

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

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Director getCreator() {
        return creator;
    }

    public void setCreator(Director creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", creator=" + creator +
                '}';
    }
}
