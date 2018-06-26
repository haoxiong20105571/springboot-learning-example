package org.spring.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ${entry.className} Tester.
 *
 * @author haoxiong
 * @version 1.0
 * @since <pre></pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestServiceTest {

    @Autowired TestService testService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInsert() {
    }

    @Test
    public void search() {
        testService.search();
    }

    @Test
    public void searchList() {
        testService.searchList();
    }

}