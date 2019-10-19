package com.pluresidea.api.emergencyincident;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {"darkSkyApiKey = 123"})
class ApiEmergencyIncidentApplicationTests {

	@Test
	void contextLoads() {
	}

}
