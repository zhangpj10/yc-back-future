package com.yc.test.service;


import com.yc.test.repository.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TestService {

    @Autowired
    private TestMapper test;

    public HashMap getUser(int id) {
        return test.getUser(id);
    }
}
