package za.ac.cput.projectsss.controller.usercredentials;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.projectsss.domain.usercredentials.GymMemberRegistration;
import za.ac.cput.projectsss.factory.usercredentials.GymMemberRegistrationFactory;

import java.net.http.HttpHeaders;

import static org.junit.Assert.*;


@SpringBootTest(webEnvironment = SpringBootTest.webEnvironment.RANDOM_PORT)

@RunWith(SpringRunner.class)
public class GymMemberRegistrationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/gymsystemtwo/gymmemberregistration";

    @Test
    public void testGetAllGymMemberResgistration(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }




    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}