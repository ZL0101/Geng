package com.ssm.dao;

import com.ssm.model.Speaker;

import java.util.List;

public interface SpeakerDao {
    void add(Speaker speaker);

    void delete(int id);

    void update(Speaker speaker);

    Speaker selectOne(int id);

    List<Speaker> selectAll();

    List<Speaker> likeAll(Speaker speaker);

    void deleteAll(int[] ids);
}
