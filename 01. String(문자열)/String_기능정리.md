# 기능 정리

<details markdown="1">
<summary>자바 입력 클래스 [Scanner]</summary>

```java
import java.util.Scanner;
    
// System.in : 사용자로부터 입력을 받기 위한 입력 스트림
Scanner in = new Scanner(System.in);
    
in.next() // String 형 입력 및 리턴 (공백을 기준으로 한 단어)
in.nextLine() // String 형 입력 및 리턴 (개행을 기분으로 한 줄)
    
// 기타 : next(Byte,Short,Int,Long,Float,Double,Boolean)
```
</details>


<details markdown="1">
<summary>String을 Char로 [charAt]</summary>
    
 - String으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 변환
    
```java
String str = "study";
char c = str.charAt(0); // s
char h = str.charAt(2); // u
```
</details>

<details markdown="1">
<summary>문자열을 char형 배열로 [toCharArray]</summary>
    
- 배열의 길이는 문자열의 길이와 같다
- 문자열의 공백 또한 인덱스에 포함
    
```java
String str = "hello world";
char[] arr = str.toCharArray();
// 쉼표로 구분해서 for문 출력 시..
// h, e, l, l, o,  , w, o, r, l, d
```
</details>

<details markdown="1">
<summary>Character 클래스로 대소문자 판별 or 변환</summary>

- char의 값을 객체로 포장한다
- isLowerCase(), isUpperCase(), toLowerCase(), toUpperCase()
```java
// 소문자인지 확인
if(Character.isLowerCase(ch)) 

// 대문자로 변환
answer += Character.toUpperCase(ch);
```
</details>

<details markdown="1">
<summary>문자열 붙이는 방식의 차이 [concat, +, StringBuilder]</summary>


### concat
- 초기값이 null이면 붙일 수 없음. new String( ) 해야됨.
- 문자열을 계속해서 붙인다고 가정하면, 붙일때마다 새로운 주소값 할당 받게 됨
- 연달아서 붙일 수 있음
    
```java
String str = new String();
String result = str.concat("Hi");
String strs = result.concat(" Hello").concat(" World");
```

### StringBuilder
    
- 초기화를 안해도 된다.
- 문자열을 계속 붙여도 주소값이 변하지 않는다
- append로 문자열을 붙임
- null 인 String과 붙이면 “null”이라는 문자열이 붙어짐
- \+ 연산자는 컴파일 될 때 StringBuilder로 변환되기 때문에 + 연산자와 함께 쓰는 것은 성능에 좋지 않다.
    
```java
StringBuilder result = new StringBuilder();
result.append("Hi");
result.append(" Hello");
```
</details>

<details markdown="1">
<summary></summary>


</details>

