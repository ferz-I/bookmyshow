package com.cinematickets.bookmyshow.repo;

import com.cinematickets.bookmyshow.models.Film;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
