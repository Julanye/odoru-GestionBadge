package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.repositories;

import com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.entities.Badge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GestionBadgeRepositoryBase<T extends Badge> extends CrudRepository<T, Long> {
}
