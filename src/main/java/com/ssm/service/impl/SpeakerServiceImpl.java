package com.ssm.service.impl;

import com.ssm.dao.SpeakerDao;
import com.ssm.model.Speaker;
import com.ssm.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    SpeakerDao speakerDao;

    @Override
    public void add(Speaker speaker) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Speaker speaker) {

    }

    @Override
    public Speaker selectOne(int id) {
        return null;
    }

    @Override
    public List<Speaker> selectAll() {
        return speakerDao.selectAll();
    }

    @Override
    public List<Speaker> likeAll(Speaker speaker) {
        return null;
    }

    @Override
    public void deleteAll(int[] ids) {

    }
}
