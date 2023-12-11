# Simple Spring AI

This project contains a web service that will accept HTTP GET requests at
`http://localhost:8080/ai/simple`.

There is optional `message` parameter whose default value is "Tell me a joke".

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

```json
{"completion":"Sure, here's a classic one for you:\n\nWhy don't scientists trust atoms?\n\nBecause they make up everything!"}
```

Now using the `message` request parameter
```shell
curl --get --data-urlencode 'message=Tell me a joke about a cow.' http://localhost:8080/ai/simple 
```

A sample response is

```json
{"completion":"Why did the cow go to space?\n\nBecause it wanted to see the \"moooon\" up close!"}
```

Alternatively use the `httpie` client
```shell
http :8080/ai/simple message=="Tell me a joke about a cow."
```
