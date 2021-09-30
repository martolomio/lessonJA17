package com.lessonJA17.domian;

import javax.persistence.*;

@Entity

public class University {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private Integer level;
    @Column
    private Integer numberInstitute;
    @Column
    private Integer numberStudents;
    @Column
    private String address;

//    public University() {
//        super();
//    }
//
//    public University(String name,Integer level,Integer numberInstitute,Integer numberStudents,String address) {
//        this.name = name;
//        this.level = level;
//        this.numberInstitute = numberInstitute;
//        this.numberStudents = numberStudents;
//        this.address = address;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Integer getNumberInstitute() {
        return numberInstitute;
    }

    public void setNumberInstitute(Integer numberInstitute) {
        this.numberInstitute = numberInstitute;
    }

    public Integer getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(Integer numberStudents) {
        this.numberStudents = numberStudents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", numberInstitute=" + numberInstitute +
                ", numberStudents=" + numberStudents +
                ", address='" + address + '\'' +
                '}';
    }
}
