package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.services;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.BadgeAlreadyAssignedException;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.MembreNotFoundException;

public interface GestionBadge {

    /**
     * Création d'un badge
     *
     * @param idMembre l'identifiant du membre associé au badge
     * @return {@Badge}
     */
    Badge creerBadge(Long idMembre) throws MembreNotFoundException, BadgeAlreadyAssignedException;

    /**
     * Retourne le badge du membre passé en paramètre
     *
     * @param idMembre l'identifiant du membre associé au badge
     * @return le {@Badge} associé au membre
     */
    Badge getBadgeByMembre(Long idMembre) throws MembreNotFoundException;

    /**
     * Retourne le badge du membre passé en paramètre
     *
     * @param idBadge l'identifiant du badge
     * @return le {@Badge}
     */
    Badge getBadgeById(Long idBadge) throws MembreNotFoundException;
}
