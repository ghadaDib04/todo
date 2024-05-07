package com.example.todolist.Patients;

import jakarta.persistence.*;



import java.time.LocalDate;

@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientID")
    private Integer patientID;

    @Column(name = "UsernamePat", unique = true, nullable = false, length = 50)
    private String usernamePat;

    @Column(name = "PasswordPat", nullable = false, length = 50)
    private String passwordPat;

    @Column(name = "FirstnamePat", nullable = false, length = 50)
    private String firstnamePat;

    @Column(name = "LastnamePat", nullable = false, length = 50)
    private String lastnamePat;

    @Column(name = "DateBirth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "Gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "SocialStatus", length = 50)
    private String socialStatus;

    @Column(name = "City", length = 100)
    private String city;

    @Column(name = "Height")
    private Float height;

    @Column(name = "Weight")
    private Float weight;

    @Column(name = "Objective", length = 100)
    private String objective;

    @Column(name = "BoneMass")
    private Float boneMass;

    @Column(name = "MuscleMass")
    private Float muscleMass;

    @Column(name = "ProteinLevels")
    private Float proteinLevels;

    @Column(name = "MedicalHistory", columnDefinition = "TEXT")
    private String medicalHistory;

    @Column(name = "NumphonePat")
    private Long numphonePat;

    @Column(name = "emailPat", length = 100)
    private String emailPat;

    @Column(name = "nutritionistID")
    private Integer nutritionistID;

    @Column(name = "mealPlanID")
    private Integer mealPlanID;

    public Patient(Integer patientID, String usernamePat, String passwordPat, String firstnamePat, String lastnamePat,
                   LocalDate dateOfBirth, String gender,
                   String socialStatus, String city, Float height,
                   Float weight, String objective, Float boneMass, Float muscleMass,
                   Float proteinLevels, String medicalHistory, Long numphonePat, String emailPat,
                   Integer nutritionistID, Integer mealPlanID) {
        this.patientID = patientID;
        this.usernamePat = usernamePat;
        this.passwordPat = passwordPat;
        this.firstnamePat = firstnamePat;
        this.lastnamePat = lastnamePat;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.socialStatus = socialStatus;
        this.city = city;
        this.height = height;
        this.weight = weight;
        this.objective = objective;
        this.boneMass = boneMass;
        this.muscleMass = muscleMass;
        this.proteinLevels = proteinLevels;
        this.medicalHistory = medicalHistory;
        this.numphonePat = numphonePat;
        this.emailPat = emailPat;
        this.nutritionistID = nutritionistID;
        this.mealPlanID = mealPlanID;
    }

    public Patient() {

    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getUsernamePat() {
        return usernamePat;
    }

    public void setUsernamePat(String usernamePat) {
        this.usernamePat = usernamePat;
    }

    public String getPasswordPat() {
        return passwordPat;
    }

    public void setPasswordPat(String passwordPat) {
        this.passwordPat = passwordPat;
    }

    public String getFirstnamePat() {
        return firstnamePat;
    }

    public void setFirstnamePat(String firstnamePat) {
        this.firstnamePat = firstnamePat;
    }

    public String getLastnamePat() {
        return lastnamePat;
    }

    public void setLastnamePat(String lastnamePat) {
        this.lastnamePat = lastnamePat;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Float getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(Float boneMass) {
        this.boneMass = boneMass;
    }

    public Float getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(Float muscleMass) {
        this.muscleMass = muscleMass;
    }

    public Float getProteinLevels() {
        return proteinLevels;
    }

    public void setProteinLevels(Float proteinLevels) {
        this.proteinLevels = proteinLevels;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Long getNumphonePat() {
        return numphonePat;
    }

    public void setNumphonePat(Long numphonePat) {
        this.numphonePat = numphonePat;
    }

    public String getEmailPat() {
        return emailPat;
    }

    public void setEmailPat(String emailPat) {
        this.emailPat = emailPat;
    }

    public Integer getNutritionistID() {
        return nutritionistID;
    }

    public void setNutritionistID(Integer nutritionistID) {
        this.nutritionistID = nutritionistID;
    }

    public Integer getMealPlanID() {
        return mealPlanID;
    }

    public void setMealPlanID(Integer mealPlanID) {
        this.mealPlanID = mealPlanID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", usernamePat='" + usernamePat + '\'' +
                ", passwordPat='" + passwordPat + '\'' +
                ", firstnamePat='" + firstnamePat + '\'' +
                ", lastnamePat='" + lastnamePat + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", city='" + city + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", objective='" + objective + '\'' +
                ", boneMass=" + boneMass +
                ", muscleMass=" + muscleMass +
                ", proteinLevels=" + proteinLevels +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", numphonePat=" + numphonePat +
                ", emailPat='" + emailPat + '\'' +
                ", nutritionistID=" + nutritionistID +
                ", mealPlanID=" + mealPlanID +
                '}';
    }
}
