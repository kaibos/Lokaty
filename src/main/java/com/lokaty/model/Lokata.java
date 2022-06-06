package com.lokaty.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lokaty")
public class Lokata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "oprocentowanie")
    private int oprocentowanie;

    @Column(name = "okres_kapitalizacji")
    private int okresKapitalizacji;

    @Column(name = "okres_waznosci_od")
    private Date okresWaznosciOd;

    @Column(name = "okres_waznosci_do")
    private Date okresWaznosciDo;

    public Lokata() {
    }

    public Lokata(String nazwa, int oprocentowanie, int okresKapitalizacji, Date okresWaznosciOd, Date okresWaznosciDo) {
        this.nazwa = nazwa;
        this.oprocentowanie = oprocentowanie;
        this.okresKapitalizacji = okresKapitalizacji;
        this.okresWaznosciOd = okresWaznosciOd;
        this.okresWaznosciDo = okresWaznosciDo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getOprocentowanie() {
        return oprocentowanie;
    }

    public void setOprocentowanie(int oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    public int getOkresKapitalizacji() {
        return okresKapitalizacji;
    }

    public void setOkresKapitalizacji(int okresKapitalizacji) {
        this.okresKapitalizacji = okresKapitalizacji;
    }

    public Date getOkresWaznosciOd() {
        return okresWaznosciOd;
    }

    public void setOkresWaznosciOd(Date okresWaznosciOd) {
        this.okresWaznosciOd = okresWaznosciOd;
    }

    public Date getOkresWaznosciDo() {
        return okresWaznosciDo;
    }

    public void setOkresWaznosciDo(Date okresWaznosciDo) {
        this.okresWaznosciDo = okresWaznosciDo;
    }
}
