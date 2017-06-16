package de.dreamit.micro;

import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheResult;
import javax.inject.Singleton;

/**
 * @author llorenzen
 * @since 16.06.17
 */
@Singleton
public class TheCache {

    @CacheResult(cacheName = "examples")
    public String getCachedExample(@CacheKey String key) {
        return "Hello " + key;
    }
}
