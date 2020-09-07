package com.community.bdd;

import com.community.SiteApplication;

import org.broadleafcommerce.common.config.EnableBroadleafSiteAutoConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Class to use spring application context while running cucumber
 */

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("default")
public abstract class SpringIntegrationTest {


  protected RestTemplate restTemplate = new RestTemplate();
 
  protected final String DEFAULT_URL = "http://localhost:8080/";
 
}
