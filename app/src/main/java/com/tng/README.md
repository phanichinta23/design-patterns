# Eager Singleton

## Description
Instance created at class load time.

## Pros
- Simple
- Thread-safe

## Cons
- Wastes memory if unused

## Example
```java
EagerSingleton singleton = EagerSingleton.getInstance();
