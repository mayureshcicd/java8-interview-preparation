package com.jav8.training.learn.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class SchedulerService {
	private ScheduledExecutorService scheduledExecutorService = null;

	public void startService() {
		System.out.println("Starting Service................");
		if (scheduledExecutorService == null) {

			scheduledExecutorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
			scheduledExecutorService.schedule(new Runnable() {
				public void run() {
					processData();
				}
			}, 1, TimeUnit.MINUTES);
		}
	}

	private void closeScheduledExecutorService() {
		System.out.println("Closing Service................");
		if (scheduledExecutorService != null) {
			scheduledExecutorService.shutdown();
			// (Re-)Cancel if current thread also interrupted
			scheduledExecutorService.shutdownNow();
			scheduledExecutorService = null;
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}

	}

	private void processData() {
	 
		
		closeScheduledExecutorService();
		
		Stream.iterate(1, n -> n + 1)
        .limit(100)        
        .onClose(()-> startService())
        .forEach(i->{
        	
        	System.out.println("process ".concat(String.valueOf(i)));
        });
				
	 

	}
}
