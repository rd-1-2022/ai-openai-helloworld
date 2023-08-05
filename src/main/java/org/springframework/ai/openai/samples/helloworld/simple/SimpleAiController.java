package org.springframework.ai.openai.samples.helloworld.simple;

import org.springframework.ai.autoconfigure.openai.OpenAiProperties;
import org.springframework.ai.openai.llm.OpenAiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAiController {

	private OpenAiClient openAiClient;

	@Autowired
	public SimpleAiController(OpenAiClient openAiClient) {
		this.openAiClient = openAiClient;
	}

	@GetMapping("/ai/simple")
	public String completion(@RequestParam(value = "text", defaultValue = "Tell me a joke") String text) {
		String response = openAiClient.generate(text);
		return response;
	}
}
