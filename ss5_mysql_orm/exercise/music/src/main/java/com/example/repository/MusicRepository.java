package com.example.repository;

import com.example.model.Music;

import java.util.List;

public interface MusicRepository {
    List<Music> findAll();

    void create(Music music);

    Music findById(int id);

    void delete(int id);

    void update(Music music);

    List<Music> search(String nameSinger);
}
