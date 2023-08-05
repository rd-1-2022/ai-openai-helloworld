# Simple Spring AI

This project contains a web service that will accept HTTP GET requests at
`http://localhost:8080/ai/simple`.

There is optional `text` parameter whose default value is "Tell me a joke".

The response to the request is from the OpenAI ChatGPT Service.

## Prerequisite

Before using the AI commands, make sure you have a developer token from OpenAI.

Create an account at [OpenAI Signup](https://platform.openai.com/signup) and generate the token at [API Keys](https://platform.openai.com/account/api-keys).

The Spring AI project defines a configuration property named `spring.ai.openai.api-key` that you should set to the value of the `API Key` obtained from `openai.com`.

Exporting an environment variable is one way to set that configuration property.
```shell
export SPRING_AI_OPENAI_API_KEY=<INSERT KEY HERE>
```

## Building and running

```
./mvnw spring-boot:run
```

## Access the endpoint

To get a response to the default request of "Tell me a joke"

```shell 
curl http://localhost:8080/ai/simple
```

A sample response is 

```text
Sure, here's a classic one for you:

Why don't scientists trust atoms?

Because they make up everything!
```

Now using the `text` request parameter
```shell
curl --get  --data-urlencode 'text=Tell me a joke about a cow.' http://localhost:8080/ai/simple 
```

A sample response is

```text
Why did the cow go to space?

Because it wanted to see the mooooon!
```

