package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.services;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.BadgeAlreadyAssignedException;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.MembreNotFoundException;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.repositories.GestionBadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GestionBadgeImpl implements GestionBadge {

    @Autowired
    GestionBadgeRepository gestionBadgeRepository;

    @Override
    public Badge creerBadge(Long idMembre) throws MembreNotFoundException, BadgeAlreadyAssignedException {
        Badge badge = new Badge();
        if (this.getBadgeByMembre(idMembre) != null) {
            badge.setNumMembre(idMembre);
            return gestionBadgeRepository.save(badge);
        } else {
            throw new BadgeAlreadyAssignedException("Un badge existe déjà pour ce membre.");
        }
    }

    @Override
    public Badge getBadgeByMembre(Long idMembre) throws MembreNotFoundException {
        if (this.gestionBadgeRepository.existsById(idMembre)) {
            return this.gestionBadgeRepository.findByIdMembre(idMembre);
        } else {
            throw new MembreNotFoundException("Aucun badge n'est associé à ce membre.");
        }
    }

    @Override
    public Badge getBadgeById(Long idBadge) throws MembreNotFoundException {
        if (this.gestionBadgeRepository.existsById(idBadge)) {
            return this.gestionBadgeRepository.findById(idBadge).get();
        } else {
            throw new MembreNotFoundException("Aucun badge n'a été trouvé.");
        }
    }
}
