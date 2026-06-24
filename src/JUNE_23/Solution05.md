# Solution05로 이해하는 static

이 문서는 [`Solution05.java`](./Solution05.java)에 나온 내용만 짧게 정리한다.

## 핵심

| 개념 | 설명 |
|---|---|
| `static` 필드 | 클래스 전체가 공유한다 |
| `static` 메서드 | 객체 생성 없이 `클래스명.메서드()`로 호출한다 |
| `final static` | 바뀌지 않는 상수처럼 쓴다 |

```mermaid
flowchart LR
    main --> util["Util.incrementCount()"]
    util --> count["Util.count"]
```

- `count`는 `Util` 클래스에 하나만 있다.
- `incrementCount()`는 객체 없이 호출된다.
- `instanceField`는 `static` 메서드에서 직접 사용할 수 없다.

## 면접용 한 줄

| 질문 | 답 |
|---|---|
| `static`의 의미는? | 클래스 단위로 공유된다는 뜻이다. |
| `this`를 `static` 메서드에서 쓸 수 있나? | 없다. 인스턴스가 없기 때문이다. |

