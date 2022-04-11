package com.example.springbootdemo.guava;

import com.example.springbootdemo.mode.User;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.time.Duration;
import java.util.concurrent.ExecutionException;

class CacheTests {

	@Test
	void cacheTest() throws ExecutionException {
		CacheLoader<String, User> cacheLoader = new CacheLoader<String, User>() {
			@Override
			public User load(String name) {
				System.out.println("load cache");
				return new User(name, 1);
			}
		};

		LoadingCache<String, User> loadingCache = CacheBuilder.newBuilder()
				.maximumSize(1000)
				.refreshAfterWrite(Duration.ofHours(1))
				.build(cacheLoader);

		System.out.println(loadingCache.get("a"));
		System.out.println(loadingCache.get("a"));
		System.out.println(loadingCache.get("a"));
		System.out.println(loadingCache.stats());

	}

}
