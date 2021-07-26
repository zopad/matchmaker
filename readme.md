# Matchmaker service

This is a Spring microservice POC project of a matchmaking service, similar
to the one found in Dota 2 matchmaking.
There will be a Matchmaking service which regularly check the Matchmaking Pool and creates pairs of 10 (default) players that are suitable to play together. This resulting Match will be the returned value from the service and the Pool will be reduced by 10 players each time.