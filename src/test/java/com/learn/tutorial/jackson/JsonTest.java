package com.learn.tutorial.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JsonTest {

    @Test
    void getJsonNode() {
        String source = "{\"title\": \"Vijay\"}";
        try {
            JsonNode jsonNode = Json.getJsonNode(source);
            Assertions.assertEquals(jsonNode.get("title").asText(), "Vijay");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}