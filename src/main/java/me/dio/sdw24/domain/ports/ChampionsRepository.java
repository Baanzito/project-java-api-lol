package me.dio.sdw24.domain.ports;

import me.dio.sdw24.domain.model.Champions;

import java.util.Optional;
import java.util.List;

public interface ChampionsRepository {
    List<Champions> findAll();

    Optional<Champions> findById(Long id);
}
