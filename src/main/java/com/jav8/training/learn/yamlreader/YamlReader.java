package com.jav8.training.learn.yamlreader;
import org.springframework.core.io.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlReader {
    public static void main(String[] args) {
        try {
            // Load config.yml from classpath
            ClassPathResource resource = new ClassPathResource("config.yml");
            InputStream inputStream = resource.getInputStream();

            // Parse YAML
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);

            // Print the result
            System.out.println("YAML content:");
            System.out.println(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
