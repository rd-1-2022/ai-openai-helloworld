package org.springframework.ai.openai.samples.helloworld.simple;

import org.springframework.ai.core.llm.LlmClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAiController {

	private LlmClient llmClient;

	@Autowired
	public SimpleAiController(LlmClient llmClient) {
		this.llmClient = llmClient;
	}

	@GetMapping("/ai/simple")
	public String completion(@RequestParam(value = "text", defaultValue = "Tell me a joke") String text) {
		return llmClient.generate(text);
	}
}
