package org.springframework.ai.openai.samples.helloworld.simple;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAiController {

	private final ChatClient chatClient;

	@Autowired
	public SimpleAiController(ChatClient aiClient) {
		this.chatClient = aiClient;
	}

	@GetMapping("/ai/simple")
	public Completion completion(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
		return new Completion(chatClient.generate(message));
	}
}
