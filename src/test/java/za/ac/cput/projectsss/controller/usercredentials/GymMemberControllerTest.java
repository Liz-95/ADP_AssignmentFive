package za.ac.cput.projectsss.controller.usercredentials;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.net.http.HttpHeaders;

import static org.junit.Assert.*;

public class GymMemberControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/gymsysystemtwo/gymMember";

    @Test
    public void testGetAllGymMember() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }


}