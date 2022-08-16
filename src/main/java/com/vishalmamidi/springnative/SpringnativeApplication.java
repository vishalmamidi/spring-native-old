package com.vishalmamidi.springnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class SpringnativeApplication {

	private static Instant startTime;
    private static Instant readyTime;
	
	public static void main(String[] args) {
		startTime = Instant.now();
		SpringApplication.run(SpringnativeApplication.class, args);
	}

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> homePage() {

        String staratup = Duration.between(startTime, readyTime).toMillis()
                + "ms";

        Map <String, String> response = new HashMap<String, String>();
        response.put("message", "Application Started in "+ staratup);
        response.put("timestamp", java.time.LocalDateTime.now().toString());

        return ResponseEntity.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(response);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void ready() {
                readyTime = Instant.now();
    }
}
