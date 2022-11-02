# Fanout AWS Spring

## Fanout Pattern

```mermaid
flowchart LR
    topic --> financial-queue --> financial-service
    topic --> accounting-queue --> accounting-service 
    topic --> inventory-queue --> inventory-service
```