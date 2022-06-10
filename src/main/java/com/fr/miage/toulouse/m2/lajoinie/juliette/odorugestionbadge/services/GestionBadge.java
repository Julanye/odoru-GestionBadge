package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.services;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;

public interface GestionBadge {

    /**
     * Création d'un badge
     * @param idMembre l'identifiant du membre associé au badge
     * @return {@Badge}
     */
    Badge creerBadge(Long idMembre);

    /**
     * Retourne le badge du membre passé en paramètre
     * @param idMembre l'identifiant du membre associé au badge
     * @return le {@Badge} associé au membre
     */
    Badge getBadge(Long idMembre);
    //throws BadgeNotFound;
}
