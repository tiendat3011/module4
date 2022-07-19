package com.example.service;

import com.example.model.Music;
import com.example.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public void delete(int id) {
        musicRepository.delete(id);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public List<Music> search(String nameSinger) {
        return musicRepository.search(nameSinger);
    }
}
