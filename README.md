# Fanout AWS Spring

## Fanout Pattern

```mermaid
flowchart LR
    purchase-service --> topic
    topic -.-> financial-queue <--> financial-service
    topic -.-> accounting-queue <--> accounting-service 
    topic -.-> inventory-queue <--> inventory-service 
```