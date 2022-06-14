package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.rest;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.BadgeAlreadyAssignedException;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions.MembreNotFoundException;
import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.services.GestionBadge;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/badge")
public class BadgeRestController {

        GestionBadge gestionBadge;

        @PostMapping("")
        public Badge associerBadge(@RequestBody Long idMembre) {
            try {
                return this.gestionBadge.creerBadge(idMembre);
            } catch (BadgeAlreadyAssignedException | MembreNotFoundException e) {
                throw new ResponseStatusException(
                        HttpStatus.SC_NOT_FOUND, "test", e);
            }
        }


}
