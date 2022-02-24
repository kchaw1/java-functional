# 자바 함수형 활용 정리

## 함수형 인터페이스 (Functional interface)

### 개요
- java.util.function 패키지에 포함되어 있다.
- 일반자바 함수와 비교해 함수형 인터페이스의 장점은 내부적으로 다양한 메소드를 제공하고 `Stream`, `Optional` 등의 인터페이스와 연동해 깨끗한 코드를 만들 수 있다. 

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

## Stream
- 컬렉션 배열 등의 요소를 하나씩 참조하여 람다식으로 처리 가능하게끔 하는 인터페이스
- `filter`, `map` 등 컬렉션 가공에 필요한 유용한 메소드들을 제공한다.
- 메서드 체이닝을 통해서 코드를 깔끔하게 작성할 수 있다.

## Optional
- NPE를 핸들링 하게끔 해주는 인터페이스
- 인자로 들어온 값에 따라 여러형태로 처리할 수 있는 메서드를 제공한다.

## Combinator pattern
- Function<체크대상객체, 유효성체크결과> 를 상속한 인터페이스를 구현한다.
- 유효성 체크결과는 enum으로 구현
- 체크대상객체의 유효성을 체크하는 static 메소드들을 생성한다.
- 각메소드를 연결하는 default method를 구현한다. 예제에서는 현재 유효성 체크가 True 일 경우
  인자로 받은 유효성 체크를 연결시키는 형태로 구현하였다.

## Callback
- 함수형 인터페이스를 메소드 인자로 설정하여 자바스크립트의 callback을 구현할 수 있다.

## Lambda
- `() -> {}` 로 구성
- 인자가 하나일경우 소괄호 생략가능 (두개 이상일경우 괄호 필수)
- 구현부가 리턴문만 있을 경우 중괄호 생략가능 (리턴문 이외의 로직이 있을 경우 중괄호 필수)

## 함수형 프로그래밍 규칙
- 외부 상태값에 의존하면 안된다.
- Side effect 가 없어야 한다.
- Higher order functions
  + 하나 또는 그 이상의 함수형 파라미터를 받는다.
  + 함수의 결과로 또다른 함수를 리턴한다.
> https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html
>
> https://www.youtube.com/watch?v=VRpHdSFWGPs

