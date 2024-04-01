package me.dio.sdw24.domain.ports;

import me.dio.sdw24.domain.model.Champion;

import java.util.Optional;
import java.util.List;

public interface ChampionsRepository {
    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
