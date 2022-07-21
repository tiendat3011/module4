package com.example.repository;

import com.example.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class MusicRepositoryImpl implements MusicRepository {

    @Override
    public List<Music> findAll() {
        List<Music> musicList = BaseRepository.entityManager.createQuery(
                "SELECT m  from music m where  status <> 1", Music.class).getResultList();
        return musicList;
    }

    @Override
    public void create(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();// mở 1 transaction
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Music music = findById(id);
        music.setStatus(1);
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }

    @Override
    public Music findById(int id) {
        Music music = BaseRepository.entityManager.createQuery(
                "SELECT m  from music m where m.id = ?1 ", Music.class)
                .setParameter(1, id).getSingleResult();

        return music;
    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();
    }
    @Override
//    public List<Music> search(String nameSinger) {
//        List<Music> musicList = BaseRepository.entityManager.createQuery(
//                "select m from music m where m.singer like ?1 and m.status = 0", Music.class)
//                .setParameter(1, "%" + nameSinger + "%").getResultList();
//        return musicList;
//    }
    public List<Music> search(String name) {
        List<Music> musicList = BaseRepository.entityManager.createQuery("select m from music m where" +
                " m.name like ?1", Music.class).setParameter(1, "%" + name + "%").getResultList();
        return musicList;
    }
}
