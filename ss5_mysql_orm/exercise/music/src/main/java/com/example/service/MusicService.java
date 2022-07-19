package com.example.service;

import com.example.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();

    void create(Music music);

    void delete(int id);

    Music findById(int id);

    void update(Music music);

    List<Music> search(String nameSinger);
}
