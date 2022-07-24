package com.example.validate_music.service;
import com.example.validate_music.model.Music;
import com.example.validate_music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepository musicRepository;

    @Override
    public Page<Music> findAll(Pageable pageable) {
        return musicRepository.findAll(pageable);
    }

    @Override
    public void create(String nameMusic, String singer, String typeMusic) {
        musicRepository.create(nameMusic,singer,typeMusic);
    }

    @Override
    public Music findById(int idSearch) {
        return musicRepository.findById(idSearch);
    }

    @Override
    public void update(String nameMusic, String singer, String typeMusic, int id) {
        musicRepository.update(nameMusic,singer,typeMusic, id);
    }

}
