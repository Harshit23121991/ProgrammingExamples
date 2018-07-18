package com.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleCompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.currentTimeMillis();
		//9. Async Methods
		/*CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
		 
		CompletableFuture<String> future = completableFuture.thenApplyAsync(s -> s + " World");
		 
		//assertEquals("Hello World", future.get());
		System.out.println(future.get());*/
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//7. Running Multiple Futures in Parallel
		
		
		CompletableFuture<String> future1  = CompletableFuture.supplyAsync(() -> "Hello");
		System.out.println("1");
		CompletableFuture<String> future2  = CompletableFuture.supplyAsync(() -> "Beautiful");
		System.out.println("2");
		CompletableFuture<String> future3  = CompletableFuture.supplyAsync(() -> "World");
		System.out.println("3");
		 
		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);
		 
		// ...
		 
		combinedFuture.get();
		System.out.println(future1.isDone());
		System.out.println(future2.isDone());
		System.out.println(future3.isDone());
		
		String combined = Stream.of(future1, future2, future3).map(CompletableFuture::join).collect(Collectors.joining(" "));
				 
		System.out.println(combined);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}

}
