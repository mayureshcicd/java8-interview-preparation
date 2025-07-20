package com.jav8.training.learn.executorservice;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class WebPageDownloader {
    public static void main(String[] args) {
        // Create an executor service with a fixed thread pool of 10 threads
        ExecutorService executorService =Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

                //Executors.newFixedThreadPool(10);

        // Create an array of URLs to download
        String[] urls = {
                "https://www.google.com",
                "https://www.facebook.com",
                "https://www.twitter.com"
        };

        // Create an array of CompletableFuture objects
        CompletableFuture<String>[] futures = new CompletableFuture[urls.length];

        // Submit each URL for download asynchronously using the executor service
        for (int i = 0; i < urls.length; i++) {
            final String url = urls[i];
            futures[i] = CompletableFuture.supplyAsync(() -> downloadWebPage(url), executorService);
        }

        // Wait for all downloads to complete and print the downloaded contents
        CompletableFuture.allOf(futures).thenRun(() -> {
            for (CompletableFuture<String> future : futures) {
                System.out.println(future.join());
            }
            executorService.shutdown();
        });
    }

    public static String downloadWebPage(String urlString) {
        try {
            // Download the web page
            URL url = new URL(urlString);
            return url.openConnection().getInputStream().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
