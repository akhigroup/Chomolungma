package com.dimkov.bgMountains.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity(name = "freelancers")
public class Freelancer extends BaseEntity{
    private int ageExperience;
    private int certificateNumber;
    private String mobileNumber;
    private BigDecimal fee;
    private String imageUrl;
    private User user;

    @Column(nullable = false)
    public int getAgeExperience() {
        return ageExperience;
    }

    public void setAgeExperience(int ageExperience) {
        this.ageExperience = ageExperience;
    }

    @Column(nullable = false)
    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Column(nullable = false)
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Column(nullable = false)
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Column(nullable = false)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @OneToOne(targetEntity = User.class)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
