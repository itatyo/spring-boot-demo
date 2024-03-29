package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

    TestRestTemplate restTemplate = new TestRestTemplate();
    @LocalServerPort
    int port;

    @Test
    public void testHello() {
        assertThat(restTemplate.getForObject("http://localhost:" + port, String.class),
                is("Hello World"));
    }

    @Test
    public void contextLoads() {
    }

}
