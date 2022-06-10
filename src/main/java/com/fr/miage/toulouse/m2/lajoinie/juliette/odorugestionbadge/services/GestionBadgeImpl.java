package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.services;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.repositories.GestionBadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GestionBadgeImpl implements GestionBadge {

    @Autowired
    GestionBadgeRepository gestionBadgeRepository;

    @Override
    public Badge creerBadge(Long idMembre) {
        Badge badge = new Badge();
        badge.setNumMembre(idMembre);
        return gestionBadgeRepository.save(badge);
    }

    @Override
    public Badge getBadge(Long idMembre){
        Badge badge = new Badge();
        return badge;
    }
}
