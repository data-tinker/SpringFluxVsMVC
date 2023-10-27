## Description
This project consists of Spring MVC and Flux services and can be used to showcase the limitations of thread-per-request model.  
Both services return random numbers, with a 2 seconds delay to simulate request processing.
In addition, this project shows how to set up Gradle multi-project build.  

## How to Run
1. Run the MVC service: `./gradlew :mvc:bootRun`
2. Make 1000 concurrent requests to the MVC service: `artillery quick --count 1000 -n 1 http://localhost:8091/api_mvc/random`
3. Run the Flux service: `./gradlew :flux:bootRun`
4. Make 1000 concurrent requests to the Flux service: `artillery quick --count 1000 -n 1 http://localhost:8092/api_flux/random`

## Results and Conclusions
The p99 response time for MVC service should be around 10 seconds, but for Flux service this value would be around 2 seconds.  
This situation happens because of thread starvation, MVC service runs out of available threads in the thread pool.  
Flux service on the other hand doesn't have this issue, since it uses an event loop for handling requests.  
