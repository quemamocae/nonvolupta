import com.example.common.cache.Cache;
import com.example.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

class TemplateSource {
    // Your implementation here
}

class Template {
    // Your implementation here
}

public class CacheExample {
    public static void main(String[] args) {
        // Create the cache
        Cache<TemplateSource, Template> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES) // Set expiration time
                .build();

        // Example usage of the cache
        TemplateSource source = new TemplateSource();
        Template template = new Template();

        // Put an entry in the cache
        cache.put(source, template);

        // Retrieve an entry from the cache
        Template cachedTemplate = cache.getIfPresent(source);
        if (cachedTemplate != null) {
            System.out.println("Template found in cache.");
        } else {
            System.out.println("Template not found in cache.");
        }
        
        // Output the size of the cache
        System.out.println("Cache size: " + cache.size());
    }
}
