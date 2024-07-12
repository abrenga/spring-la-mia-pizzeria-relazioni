package it.lamiapizzeria.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table
public class ModelOfSpecialPrice {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String NameOfSpecialPrice;

    @Column(name="£special_Price", nullable=false)
    private LocalDateTime  speciaPriceDate;


    @Column()
    private String Description;


    @ManyToOne
    @JoinColumn(name="pizza_id" ,nullable=false)
    private ModelofmenuDB pizze;



    public Integer getId() {
        return id;
    }


    public ModelofmenuDB getPizze() {
        return pizze;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public void setNameOfSpecialPrice(String nameOfSpecialPrice) {
        NameOfSpecialPrice = nameOfSpecialPrice;
    }


    public void setSpeciaPriceDate(LocalDateTime speciaPriceDate) {
        this.speciaPriceDate = speciaPriceDate;
    }


    public void setDescription(String description) {
        Description = description;
    }


    public void setEndOfSpecialPrice(LocalDateTime endOfSpecialPrice) {
        this.endOfSpecialPrice = endOfSpecialPrice;
    }


    public String getNameOfSpecialPrice() {
        return NameOfSpecialPrice;
    }


    public LocalDateTime getSpeciaPriceDate() {
        return speciaPriceDate;
    }


    public String getDescription() {
        return Description;
    }


    public LocalDateTime getEndOfSpecialPrice() {
        return endOfSpecialPrice;
    }


    private LocalDateTime endOfSpecialPrice;



    public void setPizze(ModelofmenuDB pizze) {
        this.pizze = pizze;
    }

    
}
