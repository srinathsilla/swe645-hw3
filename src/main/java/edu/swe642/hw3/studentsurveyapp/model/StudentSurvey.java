package edu.swe642.hw3.studentsurveyapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "STUDENT_SURVEY")
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String zip;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date surveyDate;
    private String preferences;
    private String interest;
    private String likelihood;
    private String addInfo;

    public StudentSurvey(){}

    public StudentSurvey(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email, Date surveyDate, String preferences,
                         String interest, String likelihood, String addInfo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.surveyDate = surveyDate;
        this.preferences = preferences;
        this.interest = interest;
        this.likelihood = likelihood;
        this.addInfo = addInfo;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(){
        this.state = state;
    }

    public String getZip(){
        return zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Date getSurveyDate(){
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate){
        this.surveyDate = surveyDate;
    }

    public String getPreferences(){
        return preferences;
    }

    public void setPreferences(String preferences){
        this.preferences = preferences;
    }

    public String getInterest(){
        return interest;
    }

    public void setInterest(String interest){
        this.interest = interest;
    }

    public String getLikelihood(){
        return likelihood;
    }

    public void setLikelihood(String likelihood){
        this.likelihood = likelihood;
    }

    public String getAddInfo(){
        return addInfo;
    }

    public void setAddInfo(String addInfo){
        this.addInfo = addInfo;
    }


}
