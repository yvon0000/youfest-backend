package com.gx.yvon.entity;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ece_product")
public class Ece_product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long pdt_id;
    @Column(length = 50)
    @NotEmpty
    private String pdt_name;
    @NotEmpty
    private String pdt_quantity;
    @NotEmpty
    private String pdt_description;
    @NotEmpty
    private String pdt_image;
    @NotEmpty
    private Date pdt_date_created;
    @NotEmpty
    private Date pdt_date_update;
    @NotEmpty
    private Date pdt_user_created;
    @NotEmpty
    private Date pdt_user_update;

    /*@OneToMany
@JoinColumn(name="prc_id")
private  List<ece_prince> ice_prince;

 @JoinColumn(name="rsv_pdt_id")
 private  List<rsv_pdt_id> ice_reservation;

@JoinColumn(name="evt_id")
 private  List<ece_event> ece_event; */
    public Ece_product() {
    }

    public long getPdt_id() {
        return pdt_id;
    }

    public void setPdt_id(long pdt_id) {
        this.pdt_id = pdt_id;
    }

    public String getPdt_name() {
        return pdt_name;
    }

    public void setPdt_name(String pdt_name) {
        this.pdt_name = pdt_name;
    }

    public String getPdt_quantity() {
        return pdt_quantity;
    }

    public void setPdt_quantity(String pdt_quantity) {
        this.pdt_quantity = pdt_quantity;
    }

    public String getPdt_description() {
        return pdt_description;
    }

    public void setPdt_description(String pdt_description) {
        this.pdt_description = pdt_description;
    }

    public String getPdt_image() {
        return pdt_image;
    }

    public void setPdt_image(String pdt_image) {
        this.pdt_image = pdt_image;
    }

    public Date getPdt_date_created() {
        return pdt_date_created;
    }

    public void setPdt_date_created(Date pdt_date_created) {
        this.pdt_date_created = pdt_date_created;
    }

    public Date getPdt_date_update() {
        return pdt_date_update;
    }

    public void setPdt_date_update(Date pdt_date_update) {
        this.pdt_date_update = pdt_date_update;
    }

    public Date getPdt_user_created() {
        return pdt_user_created;
    }

    public void setPdt_user_created(Date pdt_user_created) {
        this.pdt_user_created = pdt_user_created;
    }

    public Date getPdt_user_update() {
        return pdt_user_update;
    }

    public void setPdt_user_update(Date pdt_user_update) {
        this.pdt_user_update = pdt_user_update;
    }

    public Ece_product(long pdt_id, String pdt_name, String pdt_quantity, String pdt_description, String pdt_image, Date pdt_date_created, Date pdt_date_update, Date pdt_user_created, Date pdt_user_update) {
        this.pdt_id = pdt_id;
        this.pdt_name = pdt_name;
        this.pdt_quantity = pdt_quantity;
        this.pdt_description = pdt_description;
        this.pdt_image = pdt_image;
        this.pdt_date_created = pdt_date_created;
        this.pdt_date_update = pdt_date_update;
        this.pdt_user_created = pdt_user_created;
        this.pdt_user_update = pdt_user_update;
    }

}
