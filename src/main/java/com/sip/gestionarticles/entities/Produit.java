package com.sip.gestionarticles.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@Entity

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Label is mandatory")
    @Column(name = "label")
    private String label;

    @Column(name = "photoFace")
    private String photoFace;

    @Column(name = "photoProfil")
    private String photoProfil;

    @Column(name = "prix")
    private float prix;

    @Column(name = "description")
    private float description;
    @Column(name = "quantiteStock")
    private Integer quantiteStock;
    @Column(name = "prixPromotion")
    private Double prixPromotion;
    @Column(name = "dateExpiration")
    private Date dateExpiration;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provider_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Provider provider;


    public Produit() {
    }

    public Produit(long id, String label, String photoFace, String photoProfil, float prix, float description, Integer quantiteStock, Double prixPromotion, Date dateExpiration, Provider provider, Provider provider1) {
        this.id = id;
        this.label = label;
        this.photoFace = photoFace;
        this.photoProfil = photoProfil;
        this.prix = prix;
        this.description = description;
        this.quantiteStock = quantiteStock;
        this.prixPromotion = prixPromotion;
        this.dateExpiration = dateExpiration;
        this.provider = provider;
        this.provider = provider1;
    }

    public String getPhotoFace() {
        return photoFace;
    }

    public void setPhotoFace(String photoFace) {
        this.photoFace = photoFace;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getDescription() {
        return description;
    }

    public void setDescription(float description) {
        this.description = description;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public Double getPrixPromotion() {
        return prixPromotion;
    }

    public void setPrixPromotion(Double prixPromotion) {
        this.prixPromotion = prixPromotion;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }



    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

}
