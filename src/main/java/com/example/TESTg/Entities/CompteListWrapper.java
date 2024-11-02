package com.example.TESTg.Entities;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class CompteListWrapper {
    private List<Compte> comptes;

    public CompteListWrapper() {}

    public CompteListWrapper(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
