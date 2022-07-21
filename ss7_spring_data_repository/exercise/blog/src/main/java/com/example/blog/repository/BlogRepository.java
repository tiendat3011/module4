package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where status = 0", nativeQuery = true)
    List<Blog> findAll();

    @Modifying
    @Query(value = "insert into blog(title,content,date_write) values(:title,:content,:date)", nativeQuery = true)
    void create(@Param("title") String title,
                @Param("content") String content,
                @Param("date") String date);

    @Modifying
    @Query(value = "update blog set title = :title,content = :content, date_write = :dateWrite where id = :id", nativeQuery = true)
    void update(@Param("title") String title,
                @Param("content") String content,
                @Param("dateWrite") String date,
                @Param("id") Integer id);


    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findById(@Param("id") int id);

    @Modifying
    @Query(value = " update blog set status = 1 where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "select * from blog where title like %:title% and status = 0", nativeQuery = true)
    Page<Blog> search(@Param("title") String title, Pageable pageable);

    @Query(value = "select * from blog where status = 0", nativeQuery = true)
    Page<Blog> findAllBlog(Pageable pageable);
}
