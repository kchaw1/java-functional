# 자바 함수형 활용 정리

## 함수형 인터페이스 (Functional interface)

### 개요
- java.util.function 패키지에 포함되어 있다.
- 일반자바 함수와 비교해 함수형 인터페이스의 장점은 내부적으로 다양한 메소드를 제공하고 `stream`, `Optional` 등의 인터페이스와 연동해 깨끗한 코드를 만들 수 있다. 

### Function, BiFunction
- `Function<T,U>` : 하나의 아규먼트, 하나의 결과
- `BiFunction<T,U,R>` : 두개의 아규먼트, 하나의 결과
- `apply` 메소드로 아규먼트를 적용한다.
- 함수형 인터페이스끼리는 `andThen` 을 활용하여 연결하여 사용할 수 있다.

### Consumer, BiConsumer
- `Consumer<T>` : 함수와 다르게 하나의 아규먼트를 갖고, 결과반환(리턴타입이 없다)을 하지 않는다.
- `accept` 메소드로 아규먼트를 적용한다.

### Perdicate
- `Predicate<T>` : 하나의 아규먼트, Boolean 타입의 결과.
- `test` 메소드로 아규먼트를 적용한다.
- `and` 메소드로 `Predicate`끼리 연결하여 사용할 수 있다.

### Supplier
- `Supplier<T>` : 아규먼트 없음. 하나의 결과

> https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
>
> https://www.youtube.com/watch?v=VRpHdSFWGPs

