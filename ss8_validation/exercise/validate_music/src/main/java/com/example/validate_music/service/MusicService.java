package com.example.validate_music.service;

import com.example.validate_music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MusicService {
    Page<Music> findAll(Pageable pageable);

    void create(String nameMusic,String singer,String typeMusic);

    Music findById(int idSearch);

    void update(String nameMusic,String singer,String typeMusic,int id);

}
