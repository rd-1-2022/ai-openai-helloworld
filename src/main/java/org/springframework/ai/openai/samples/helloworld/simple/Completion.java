package org.springframework.ai.openai.samples.helloworld.simple;

public class Completion {

    private String completion;

    public Completion(String completion) {
        this.completion = completion;
    }

    public String getCompletion() {
        return completion;
    }
}
